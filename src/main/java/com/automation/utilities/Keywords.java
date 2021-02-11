package com.automation.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords {
	
	private WebDriver driver;
	
	public Keywords(WebDriver webDriver) {
		this.driver = webDriver;
	}
	
	public void explicitWait(WebElement element, int i) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

//	public void clickUsingJSE(WebElement element) {
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();",element);
//	}
//	
//	public void scrollToViewElement(WebElement element) {
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].scrollIntoView();",element);
//	}
}
