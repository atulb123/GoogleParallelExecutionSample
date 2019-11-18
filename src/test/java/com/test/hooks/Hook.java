package com.test.hooks;

import org.testng.Reporter;
import org.testng.annotations.Parameters;

import com.test.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{
	@Before("@Hooks")
	public void browserInitialization() throws Throwable {
		System.out.println(Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser"));
		launchBrowser();
	}
	
	@After("@Hooks")
	public void closeBrowser() {
		browserFactory.removeDriver();
	}
}
