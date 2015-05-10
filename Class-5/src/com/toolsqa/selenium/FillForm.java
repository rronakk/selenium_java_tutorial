package com.toolsqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		
		d.get("http://www.toolsqa.com/automation-practice-form/");
		
		WebElement fn = d.findElement(By.name("firstname"));
		fn.sendKeys("Tools");
		
		d.findElement(By.name("lastname")).sendKeys("QA");
		
		d.findElement(By.id("sex-1")).click();
		
		d.findElement(By.id("profession-1")).click();
		
		WebElement contiE = d.findElement(By.id("continents"));
		Select conti = new Select(contiE);
		conti.selectByIndex(4); // 0 - Based Index
		
		conti.selectByVisibleText("Australia");
		
		WebElement selCommandsE = d.findElement(By.id("selenium_commands"));
		Select selCommands = new Select(selCommandsE);
		
		selCommands.selectByIndex(0);
		
		selCommands.selectByIndex(2);
		
		
	}
}
