package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public abstract class AbstractTestCase implements ITestCase{

	// Mandatory to impelement all methods of interface
	// Code re-use isn't there
	
	@Override
	public void setup() {
		System.out.println("Common Setup");
		
	}

	// A Must Implementation function for all test cases
	public abstract void run(WebDriver driver) ;

	@Override
	public void cleanup() {
		System.out.println("Common Cleanup");
	}

}
