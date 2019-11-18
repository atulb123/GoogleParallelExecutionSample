package com.test.stepdefs;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.test.acceptancetest.RunTest;
import com.test.baseclass.BaseClass;
import com.test.baseclass.BrowserFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class GoogleHomePageStepDefs extends BaseClass {
	@Given("I open google page")
	public void i_open_google_page() {
		browserFactory.getDriver().get("https://www.google.com");
	}

	@Then("I validate title")
	public void i_validate_title() {
		wait.until(ExpectedConditions.titleContains("Google"));
		Assert.assertTrue(browserFactory.getDriver().getTitle().contains("Google"), "Title mismatch");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
