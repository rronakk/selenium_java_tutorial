package com.toolsqa.framework;

import org.openqa.selenium.WebDriver;

public interface ITestCase {

	void setup(); // Start Browser
	void cleanup(); // Close 
	void run();
}
