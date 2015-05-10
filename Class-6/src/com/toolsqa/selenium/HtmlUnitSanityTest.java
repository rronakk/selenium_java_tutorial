package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public class HtmlUnitSanityTest {

	public void run(WebDriver driver)
	{
		driver.get("http://www.google.com");
		if(driver.getTitle().contains("Google"))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
	}
}
