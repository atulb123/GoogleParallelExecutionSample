package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.test.baseclass.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath = "//*[.='Gmail']")
	public WebElement gmailLink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickGmailLink() {
		wait.until(ExpectedConditions.visibilityOf(gmailLink)).click();
	}
}
