package com.toolsqa.selenium;

import org.openqa.selenium.WebDriver;

public class EncasulationExample {

	
	// A Member of class can access other members
	private WebDriver wdPrivate;
	
	public WebDriver wdPublic;
	
	void downloadData()
	{
		fastDownload();
	}
	
	public void fastDownload()
	{
		
	}
	
	protected WebDriver wdProtected;
	
}
