package com.toolsqa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class SeleniumWaitCommandsTest implements ITestCase {

	@Override
	public void run(WebDriver driver) {

		driver.get("http://www.toolsqa.com/automation-practice-switch-windows");
		
		// Polling=1s and Timeout=30s
		FluentWait<WebDriver> waiter = new FluentWait<WebDriver>(driver);
		waiter.withTimeout(20, TimeUnit.SECONDS);
		waiter.pollingEvery(1, TimeUnit.SECONDS);
		// Mandate
		waiter.ignoring(NoSuchElementException.class);
		
		// Approach -1
		/*
		WebElement element =  waiter.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.partialLinkText("Element1"));
			}
			
		});
		*/
		
	
		// Approach - 2
		WebElement element = waiter.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Element1")));
		
		// Thread.sleep(30*1000);
		
		System.out.println("TagName: "+ element.getTagName());
		
		// Not Immediately Available

	}

}
