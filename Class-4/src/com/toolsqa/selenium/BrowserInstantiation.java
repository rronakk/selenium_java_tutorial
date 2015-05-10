package com.toolsqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInstantiation {

	public static void ChromeBrowserTest()
	{
		// This is needed by ChromeDriver constructor code
		//System.setProperty("webdriver.chrome.driver", 
		//		"C:\\Users\\Sandy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			// OR
		
		// Set System Path Variable to point to folder containing chromedriver.exe
		
		ChromeDriver cd = new ChromeDriver();
		
		
		
		// Quit vs Close
		cd.quit();
	}
	
	public static void IEBrowser()
	{
		InternetExplorerDriver ied = new InternetExplorerDriver();
		
		//ied.quit();
		
	}
	
	public static void main(String[] args) {
	
		IEBrowser();

	}

}
