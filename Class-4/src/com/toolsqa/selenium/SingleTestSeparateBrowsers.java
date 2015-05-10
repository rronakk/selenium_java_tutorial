package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.thoughtworks.selenium.webdriven.commands.FireEvent;

public class SingleTestSeparateBrowsers {

	public static void main(String[] args) {
		
		// Exercise:
		// Take User Input on Browser Type
		System.out.println("Enter ie, chrome or firefox to run test against browser of your choice: ");
		
		// You need to fill in the code to take user input
		
		WebDriver driver = getDriverBasedOnUserChoice("ie");
		driver.get("http://google.com");
		driver.quit();

	}

	
	
	private static WebDriver getDriverBasedOnUserChoice(String browser) {
		if(browser.equals("ie"))
			return new InternetExplorerDriver();
		else if(browser.equals("chrome"))
			return new ChromeDriver();
		else
			return new FirefoxDriver();
	}

}
