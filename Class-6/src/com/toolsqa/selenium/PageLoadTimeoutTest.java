package com.toolsqa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class PageLoadTimeoutTest implements ITestCase {

	@Override
	public void run(WebDriver driver) {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com");
		
		// Applicable here as well
		driver.get("http://www.google.com");
		
	}

}
