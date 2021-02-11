package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.Keywords;

public class TShirtsPage {
	
	private WebDriver driver;
	
	public TShirtsPage(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(css="a[title=\"Faded Short Sleeve T-shirts\"]")
	WebElement tShirt;
	
	@FindBy(name="Submit")
	WebElement addToCart;
	
	@FindBy(xpath="//span[@title=\"Close window\"]/following-sibling::h2")
	WebElement confirmationMessage;
	
	@FindBy(xpath="//a[@title=\"Proceed to checkout\"]")
	WebElement proceedToCheckOut1;
	
	@FindBy(xpath="(//a[@title=\"Proceed to checkout\"])[2]")
	WebElement proceedToCheckOut2;
	
	@FindBy(linkText="Faded Short Sleeve T-shirts")
	WebElement addedProduct;
	
	public void clickTShirt() {
		tShirt.click();
	}
	
	public void clickAddToCart() {
		driver.switchTo().frame(0);
		addToCart.click();
		driver.switchTo().defaultContent();
	}

	public boolean isConfirmationMessageDisplayed() {
		Keywords keyword = new Keywords(driver);
		keyword.explicitWait(confirmationMessage, 5);
		return confirmationMessage.getText().toString().contains("Product successfully added to your shopping cart");
	}

	public void clickProceedToCheckOut1() {
		proceedToCheckOut1.click();
	}
	
	public void clickProceedToCheckOut2() {
		proceedToCheckOut2.click();
	}
	
	public boolean isProductAdded() {
		return addedProduct.isDisplayed();
	}
}
