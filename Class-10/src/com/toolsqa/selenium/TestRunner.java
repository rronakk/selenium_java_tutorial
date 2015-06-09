
package com.toolsqa.selenium;

import java.util.ArrayList;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestRunner {

	public static String URL = "";
	public static WebDriver getWebDriver(String browser)
	{
		if(browser.equalsIgnoreCase("ie"))
			return new InternetExplorerDriver();
		if(browser.equalsIgnoreCase("ie_toolsqa_startup"))
		{
			DesiredCapabilities capabilities =  new DesiredCapabilities();
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
					"http://toolsqa.com");
			
			return new InternetExplorerDriver(capabilities);
		}
		else if(browser.equalsIgnoreCase("chrome"))
			return new ChromeDriver();
		else if(browser.equalsIgnoreCase("htmlUnit"))
			return new HtmlUnitDriver();
		return new FirefoxDriver();
	}
	
	
	public static void main(String[] args) {

		WebDriver driver = getWebDriver("ie_toolsqa_startup");
		
		//EncasulationExample ee = new EncasulationExample();
		
		// AbstractTestCase.VALUE;
		
		// Concrete Class
		//AbstractTestCase atc = new FunctionalTestCase_AbstractClass();
		
		ArrayList<ITestCase> testCases = new ArrayList<>();
				
		//testCases.add(new DragAndDropTest());
		
		
		for(ITestCase tc : testCases)
			tc.run(driver);
		
		
		// Some Delay So that we can see the window after test is complete
		try {
			System.out.println("Waiting for few seconds before exiting");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
