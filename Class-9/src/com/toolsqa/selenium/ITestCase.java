package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public interface ITestCase {
	
	void setup();
	void run(WebDriver driver);
	void cleanup();
	
}
