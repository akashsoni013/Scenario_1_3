package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	private WebDriver driver;
	
	public MyAccountPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath="(//a[@title=\"T-shirts\"]/parent::li)[2]")
	WebElement tshirt;
	
	
	public void clickTShirtsTab() {
		tshirt.click();
	}
	
}
