package com.toolsqa.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchBetweenWindows implements ITestCase {

	@Override
	public void run(WebDriver driver) {
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows");
		String mainWindowHandle = driver.getWindowHandle();
		
		
		WebElement we = driver.findElement(By.id("button1"));
		
		for (int i = 0; i < 5; i++) {
			we.click();
		}
		
		
		Set<String> handles = driver.getWindowHandles();
				
		
		// Print Handles of all opened windows
		for (String handle : handles) {
			System.out.println("Handle: " + handle);
			
			driver.switchTo().window(handle);
			
			System.out.println("URL: "+ driver.getCurrentUrl());
			System.out.println("Title: "+ driver.getTitle());
			System.out.println();
			
			if(!handle.equalsIgnoreCase(mainWindowHandle))
				driver.close();
		}

	}

}
