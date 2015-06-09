
package com.toolsqa.selenium;

import java.util.ArrayList;

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
	}
	
	
	public static void main(String[] args) {

		WebDriver driver = getWebDriver("firefox");
		
		ArrayList<ITestCase> testCases = new ArrayList<>();
				
		testCases.add(new FunctionalTestCase());
		testCases.add(new PerformanceTestCase());
		
		for(ITestCase tc : testCases){
			tc.setup();
			tc.run(driver);
			tc.cleanup();
		}
		
		
		driver.quit();
	}
}
