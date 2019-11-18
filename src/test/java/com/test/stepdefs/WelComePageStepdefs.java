package com.test.stepdefs;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.test.baseclass.BaseClass;
import com.test.baseclass.BrowserFactory;
import com.test.pages.HomePage;

import io.cucumber.java.en.Then;



public class WelComePageStepdefs extends BaseClass {
	private HomePage homePage = new HomePage(browserFactory.getDriver());

	@Then("I validate serachbox")
	public void i_validate_serachbox() {
		homePage.clickGmailLink();
		//wait.until(ExpectedConditions.titleContains("Gmail"));
		Assert.assertTrue( browserFactory.getDriver().getTitle().contains("Gmail"),"gmail page failed");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
