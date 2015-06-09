package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public abstract class AbstractTestCase {

	public static int VALUE; 
	public abstract void run(WebDriver driver);
	
	void setup()
	{
		// 
	}
	
	void cleanup()
	{
		
	}
}
