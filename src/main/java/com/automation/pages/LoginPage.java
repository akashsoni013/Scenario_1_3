package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement passwrd;
	
	@FindBy(id="SubmitLogin")
	WebElement signIn;
	
	public void enterEmailId(String emailId) {
		email.sendKeys(emailId);
	}
	
	public void enterPassword(String password) {
		passwrd.sendKeys(password);
	}
	
	public void clickSignIn() {
		signIn.click();
	}
}
