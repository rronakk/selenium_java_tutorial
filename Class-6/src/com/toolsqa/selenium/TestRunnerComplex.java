package com.toolsqa.selenium;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestRunnerComplex {

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
	
	public static ArrayList<WebDriver> getWebDrivers()
	{
		// Configuration File Mentioning browsers
		ArrayList<WebDriver> drivers = new ArrayList<>();
		
		// Read File in a Loop and for each line add a driver object to list
		drivers.add(getWebDriver("firefox"));
		drivers.add(getWebDriver("chrome"));
		
		return drivers;
	}

	
	public static void main(String[] args) throws IOException {
		
		// Benefit of doing this also
		WebDriver driver = getWebDriver("htmlUnit");
		
		ArrayList<WebDriver> drivers = getWebDrivers();
		
		

		// Test-1
		//JavaWayOfSanityTest jwost = new JavaWayOfSanityTest();
		//jwost.run(null);

		
		// Test-2
		HtmlUnitSanityTest hust = new HtmlUnitSanityTest();
		
		for (WebDriver wd : drivers) {
			hust.run(wd);
			wd.quit();
		}
		
		driver.quit();
		
		
	}
	
}
