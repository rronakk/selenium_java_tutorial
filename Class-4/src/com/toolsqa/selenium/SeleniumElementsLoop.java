package com.toolsqa.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumElementsLoop {

	public static void main(String[] args) {
		
		FirefoxDriver fd = new FirefoxDriver();
		
		fd.get("http://www.google.com");
		
		WebElement txtBox = fd.findElementById("lst-ib");
		txtBox.sendKeys("selenium");
		txtBox.submit();
		
		
		List<WebElement> al = fd.findElementsByTagName("a");
		
		System.out.println("Count of Anchor Tag: "+ al.size());
		boolean pass = false;
		for (int i = 0; i < 10; i++) {
			
			String a = al.get(i).getText();
			
			System.out.println(a);
			
			if(a.contains("toolsqa.com"))
				pass= true;
			
		}
		
		if(pass == false)
			System.out.println("Test Failed");
		
		// Difference between fd.close() and fd.quit()
		// fd.close();
		
		fd.quit();
		
	}

}
