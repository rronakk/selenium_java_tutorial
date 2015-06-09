package com.toolsqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.CompositeAction;

public class DragAndDropTest implements ITestCase {

	@Override
	public void run(WebDriver driver) {
		
		// Browse to http://demoqa.com/droppable/
		driver.get("http://demoqa.com/droppable/");
		
		WebElement source = driver.findElement(By.id("draggableview"));
		WebElement target = driver.findElement(By.id("droppableview"));
		
		Actions dnd = new Actions(driver);
		
		dnd.dragAndDrop(source, target);
		
		// Build - Action
		CompositeAction act = (CompositeAction) dnd.build();
		System.out.println("ActionsCount: " + act.getNumberOfActions());
		
		dnd.click().doubleClick();
		CompositeAction act2 = (CompositeAction) dnd.build();
		
		System.out.println("ActionsCount: " + act2.getNumberOfActions());
		
		// Perform
		act.perform();
		
		
		// Actions - Approach2
		// dnd.dragAndDrop(source, target).build().perform();
		
		// Actions - Approach3
		//dnd.dragAndDrop(source, target).click().doubleClick().perform();
	}

}
