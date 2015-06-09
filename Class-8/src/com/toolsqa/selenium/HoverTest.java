package com.toolsqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverTest implements ITestCase {

	@Override
	public void run(WebDriver driver) {
		
		// Browse to http://demoqa.com/droppable/
		driver.get("http://www.toolsqa.com/");
		
		WebElement toElement = driver.findElement(By.xpath("//*[@id=\"main-nav\"]/li[2]"));
		
		Actions hover = new Actions(driver);
		
		
		// Launch submenu and click an item there
		//hover.moveToElement(toElement).click(findElementCucumber).perform();
		
		hover.moveToElement(toElement).perform();
		
	}

}
