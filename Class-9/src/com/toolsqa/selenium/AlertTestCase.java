package com.toolsqa.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertTestCase implements ITestCase {

	@Override
	public void run(WebDriver driver) {

		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");

		WebElement we = driver.findElement(By.id("alert"));
		we.click();

		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);

		// something wrong here
		// Need to verify text in alert window
		if ("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.".equals(message))
			System.out.println("Test pass");
		else
			System.out.println("Test failed");

		alert.dismiss();

	}

	@Override
	public void setup() {
		
		
	}

	@Override
	public void cleanup() {
		
	}

}
