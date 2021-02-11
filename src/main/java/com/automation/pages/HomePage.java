package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(css="a[title=\"Log in to your customer account\"]")
	WebElement signIn;
	
	public void clickSignIn() {
		signIn.click();
	}
}
