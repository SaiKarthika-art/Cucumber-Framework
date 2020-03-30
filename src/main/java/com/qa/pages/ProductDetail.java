package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class ProductDetail extends TestBase {
	
	String nam;
	String actualNam;

	// Page Factory - OR

	@FindBy(id = "productTitle")
	WebElement txtShirtName;
	
	@FindBy(xpath = "//*[contains(@id,'native_dropdown_selected_size_name')]")
	WebElement drpShirtSize;

	@FindBy(xpath = "//*[contains(@id,'sc-subtotal-amount-buybox')]")
	WebElement txtShirtPrice;
	
	@FindBy(xpath = "//*[contains(@id,'add-to-cart-button')]")
	WebElement btnAddToCart;

	@FindBy(xpath = "//*[contains(@class,'nav-cart-icon')]")
	WebElement cartIcon;

	@FindBy(xpath = "//*[contains(@class,'product-title')]")
	WebElement itemNameInCart;

	@FindBy(xpath = "//*[contains(@class,'product-price')]")
	WebElement priceInCart;
	
	@FindBy(xpath = "//*[contains(@name,'proceedToRetailCheckout')]")
	WebElement btnCheckout;

	// Initializing the WebElements
	public ProductDetail() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void selectSize() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf((drpShirtSize)));
		Select select = new Select(drpShirtSize);
		select.selectByIndex(1);	
		Thread.sleep(6000);
	}

	public String getShirtName() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf((txtShirtName)));
		String[] name = txtShirtName.getText().split(" ");
		for(int i=0;i<1;i++) {
			 nam = name[i].toLowerCase();
		}	
		System.out.println("The shirt name is : " + nam);
		return nam;
	}

	public String getShirtPrice() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf((txtShirtPrice)));
		String price = txtShirtPrice.getText();
		System.out.println("The shirt price is : " + price);
		return price;
	}
	// click Add to cart button
	public void clickAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable((btnAddToCart)));
		btnAddToCart.click();
	
	}
	
	public void clickCartIcon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable((cartIcon)));
		Thread.sleep(6000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", cartIcon);
	}
	
	public String verifyShirtNameInCartPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf((itemNameInCart)));
		String[] actualShirtname = itemNameInCart.getText().split(" ");
		for(int i=0;i<1;i++) {
			 actualNam = actualShirtname[i].toLowerCase();
		}	
		System.out.println("The shirt name in cart page is : " + actualNam);
		return actualNam;
	}

	public String verifytotalInCart() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf((priceInCart)));
		String totalInCart = priceInCart.getText();
		System.out.println("Total in cart page is : " + totalInCart);
		return totalInCart;
	}
	
	public void clickCheckoutButton() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable((btnCheckout)));
		btnCheckout.click();
	}
}
