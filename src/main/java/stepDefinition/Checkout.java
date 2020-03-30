package stepDefinition;

import com.qa.pages.HomePage;
import com.qa.pages.ProductDetail;
import com.qa.pages.ProductListing;
import com.qa.util.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Checkout extends TestBase{
	
	HomePage homepage;
	ProductListing prodListPage;
	ProductDetail prodDetail;
	
	String shirtname;
	String shirtNameInCartPage;
	String totalInCartPage;
	String shirtTotal;
	
	@Given("user is logged onto the Amazon website as a guest user")
	public void user_is_logged_onto_the_Amazon_website_as_a_guest_user( ) {
		TestBase.initiaization();	   
	}

	@When("user searches a \"(.*)\" on the homepage")
	public void user_searches_a_on_the_homepage(String product) throws InterruptedException {
		homepage = new HomePage();
		homepage.searchForProduct(product);	   
	}

	@Then("user should be able to view product information related to product searched")
	public void user_should_be_able_to_view_product_information_related_to_product_searched() {
		prodListPage = new ProductListing();
		prodListPage.clickRandomProducts();
	}

	@Then("user click on add to cart button")
	public void user_click_on_add_to_cart_button() throws InterruptedException {
		prodDetail = new ProductDetail();
		shirtname = prodDetail.getShirtName();
		prodDetail.selectSize();
		prodDetail.clickAddToCart();   
	}

	@Then("user verifies if the product is added to cart")
	public void user_verifies_if_the_product_is_added_to_cart() throws InterruptedException {
		prodDetail = new ProductDetail();
		prodDetail.clickCartIcon();
		shirtNameInCartPage = prodDetail.verifyShirtNameInCartPage();
		totalInCartPage = prodDetail.verifytotalInCart();
		shirtTotal = prodDetail.getShirtPrice();
		Assert.assertEquals(shirtname, shirtNameInCartPage);  
		Assert.assertEquals(totalInCartPage, shirtTotal);  
		
	}

	@When("user navigates to order confirmation page via express checkout option")
	public void user_navigates_to_order_confirmation_page_via_express_checkout_option() {
		prodDetail = new ProductDetail();
	   prodDetail.clickCheckoutButton();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
			scenario.write("Scenario failed");
		}else {
			scenario.write("Scenario passed");
		}
		driver.close();
	}


	
}