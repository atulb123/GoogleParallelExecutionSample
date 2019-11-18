package com.test.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {
	private static BrowserFactory instance = null;
	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private BrowserFactory() {

	}

	public static BrowserFactory getInstance() {
		if (instance == null) {
			instance = new BrowserFactory();
		}
		return instance;
	}

	public final void setDriver(String browser) throws Exception {


		switch (browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"./chromedriver.exe");
			webDriver.set(new ChromeDriver());
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"./geckodriver.exe");
			webDriver.set(new FirefoxDriver());
			break;
		}
	}

	public WebDriver getDriver() {
		return webDriver.get();
	}
	
	   public void removeDriver() // Quits the driver and closes the browser
	   {
		   webDriver.get().quit();
		   webDriver.remove();
	   }
}