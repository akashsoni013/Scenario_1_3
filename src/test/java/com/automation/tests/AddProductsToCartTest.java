package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.TestBase;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.TShirtsPage;

public class AddProductsToCartTest extends TestBase {

	@Test
	public void addProductsToCart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickSignIn();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailId("jetblue@grr.la");
		loginPage.enterPassword("jetblue");
		loginPage.clickSignIn();
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		myAccountPage.clickTShirtsTab();
		TShirtsPage tShirtsPage = new TShirtsPage(driver);
		tShirtsPage.clickTShirt();
		tShirtsPage.clickAddToCart();
		Assert.assertTrue(tShirtsPage.isConfirmationMessageDisplayed());
		tShirtsPage.clickProceedToCheckOut1();
		Assert.assertTrue(tShirtsPage.isProductAdded());
		tShirtsPage.clickProceedToCheckOut2();
	}
	
}
