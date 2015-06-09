package com.toolsqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalConstants {

	public static final int ELEMENT_LOCATING_DEFAULT_TIMEOUT = 10;//default value of 10sec
	
	public static final String VALID_USERNAME = "10janbatch_test1";
	public static final String VALID_PASSWORD = "18NYVIZMI52f";
	
	
	public static final String MESSAGE_FILE = "it-it_Messages.txt";
	
	public static final String HOME_PAGE_URL = "http://store.demoqa.com";
	public static final String LOGIN_PAGE = "http://store.demoqa.com/products-page/your-account";
	
	
	public static final String HOME_PAGE_TITLE= "ONLINE STORE";
	public static final String LOGIN_PAGE_TITLE= "Your Account";
	
	public static WebDriver currentDriver  = null;
	
	// LoginErrorMessage=Invalid UserName
	// LoginErrorMessage=Invlid UsN
	
}
