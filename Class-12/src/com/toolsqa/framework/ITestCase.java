package com.toolsqa.framework;

import org.openqa.selenium.WebDriver;

public interface ITestCase {

	void setup();
	void cleanup();
	void run();
}
