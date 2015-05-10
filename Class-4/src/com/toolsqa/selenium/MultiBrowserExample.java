package com.toolsqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserExample {

	public static void main(String[] args) {
		
		FirefoxDriver ffd = new FirefoxDriver();
		
		ChromeDriver chd = new ChromeDriver();
		
		ffd.get("http://google.com");

		chd.get("http://oracle.com");
		
		ffd.navigate().to("http://toolsqa.com");
		
		chd.navigate().to("http://microsoft.com");
		
		ffd.quit();
		chd.quit();
		
	}
}
