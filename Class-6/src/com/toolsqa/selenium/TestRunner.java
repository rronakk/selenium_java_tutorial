package com.toolsqa.selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestRunner {

	public static WebDriver getWebDriver(String browser)
	{
		if(browser.equalsIgnoreCase("ie"))
			return new InternetExplorerDriver();
		else if(browser.equalsIgnoreCase("chrome"))
			return new ChromeDriver();
		else if(browser.equalsIgnoreCase("htmlUnit"))
			return new HtmlUnitDriver();
		return new FirefoxDriver();
		
		
		// Configuration before returning
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MINUTES);
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = getWebDriver("firefox");
		
		// TODO:  Your Test Object goes here
		ArrayList<ITestCase> testCases = new ArrayList<>();
		//testCases.add(new BrowserMaximizedTest());
		//testCases.add(new PageLoadTimeoutTest());
		testCases.add(new DelayLoadedElementsTest());
		
		for(ITestCase tc : testCases)
			tc.run(driver);
		
		driver.quit();
	}
}
