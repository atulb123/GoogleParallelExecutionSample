package com.test.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BaseClass {
	public static BrowserFactory browserFactory = BrowserFactory.getInstance();
	public static WebDriverWait wait;
    public void launchBrowser() throws Exception 
    {
    	browserFactory.setDriver(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser"));
		browserFactory.getDriver().get("http://www.google.com");
		wait=new WebDriverWait(browserFactory.getDriver(), 15);
    }    
}