package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public class FunctionalTestCase_AbstractClass extends AbstractTestCase
{

	@Override
	public void run(WebDriver driver) {
	
		
		
	}
	
	@Override
	void cleanup()
	{
		// Use SuperClass Cleanup
		super.cleanup();
		
		
		// Add your own code
	}
}
