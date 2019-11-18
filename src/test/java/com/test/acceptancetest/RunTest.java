package com.test.acceptancetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.baseclass.BrowserFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author CHIRAG
 *
 */

// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/resources/feature" }, glue = { "com.test" }, tags = { "@Smoke" }, plugin = {
		"pretty", "html:target/cucumber-reports" })
@Test
public class RunTest extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}



}
