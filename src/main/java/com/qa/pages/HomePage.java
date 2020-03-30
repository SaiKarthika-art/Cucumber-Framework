package com.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class HomePage extends TestBase {

	// Page Factory - OR

	// static xpath
	@FindBy(id = "twotabsearchtextbox")
	WebElement txtSearchBox;

	// Initializing the page objects

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	// Search for product
	public void searchForProduct(String product) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf((txtSearchBox)));
		txtSearchBox.sendKeys(product);
		txtSearchBox.sendKeys(Keys.ENTER);
	}

}
