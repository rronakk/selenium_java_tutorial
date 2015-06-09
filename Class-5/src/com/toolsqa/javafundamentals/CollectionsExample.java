package com.toolsqa.javafundamentals;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsExample {

	public static void main(String[] args) {
		
		// Count unique urls on a web page
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		// Locate all <a href="http://toolsqa.com">tags in HTML
		List<WebElement> anchorElements = driver.findElements(By.tagName("a"));
		
		HashSet<String> hs = new HashSet<String>();

		for (WebElement we : anchorElements) {
			
			String url  = we.getAttribute("href");
			hs.add(url);
			
		}
		
		/*
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("first");
		*/
		
		System.out.println("SizeOf HashSet: " + hs.size()+ " SizeOf Elements: "+anchorElements.size());
		System.out.println(anchorElements);
		System.out.println(hs);
	}

}
