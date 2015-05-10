package com.toolsqa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DelayLoadedElementsTest implements ITestCase {

	@Override
	public void run(WebDriver driver) {

		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		//Approach-1
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Approach-2
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement we = driver.findElement(By.partialLinkText("Element1"));
		
		System.out.println("Text: "+ we.getText());
		

	}

}
