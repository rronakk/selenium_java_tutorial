package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;

public class BrowserMaximizedTest implements ITestCase {

	@Override
	public void run(WebDriver driver) {
		
		// Approach-1, Will Maximize browser
		Options opt = driver.manage();
		Window w = opt.window();
		w.maximize();
		
		// Approach-2, Shorthand
		driver.manage().window().maximize();
		
		System.out.println("Before Sleep");
		// wait for 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After Sleep");
	}	
}
