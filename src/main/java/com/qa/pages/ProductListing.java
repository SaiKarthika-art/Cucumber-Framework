package com.qa.pages;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class ProductListing extends TestBase {

	// Page Factory - OR

	@FindBy(xpath = "//*[contains(@data-component-type,'s-product-image')]/parent::div")
	List<WebElement> listOfItems;

	// Initializing the WebElements
	public ProductListing() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	// Selecting any random products from the list and clicking on it
	public void clickRandomProducts() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Random rand = new Random();
		listOfItems.get(rand.nextInt(listOfItems.size())).click();

	}
}
