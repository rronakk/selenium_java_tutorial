package com.toolsqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomWaitForDelayLoadedElementsTest implements ITestCase {

	public void run(WebDriver driver) {
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows");

		int timeout = 30000; // 30 sec
		int pollingTime = 100; // 100 ms
	
		long startTime = System.currentTimeMillis();
		WebElement we = null;
		while (System.currentTimeMillis() - startTime < timeout) // While we are still within 30 second timeout, We should
						// still search
		{
			try {
				we = driver.findElement(By.partialLinkText("Element1"));
				
				break; // If Element Found, Come out of loop
				
			} catch (Exception e) {
				System.out.println("Not Found Yet");
			}
			
			
			try {
				Thread.sleep(pollingTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(we==null)
			System.out.println("Element Not Found");
		else
			System.out.println("Element Found");

	}

}
