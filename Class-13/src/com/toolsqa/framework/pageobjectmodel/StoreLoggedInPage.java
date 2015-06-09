package com.toolsqa.framework.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import com.toolsqa.framework.GlobalConstants;

public class StoreLoggedInPage extends PageBase {

	StoreLoggedInPage(WebDriver driver)
	{
		super(driver);
	}

	public StoreLoginPage clickLogoutLink()
	{
		// Wait for timeout and then click logout
		int timeoutInSec = GlobalConstants.ELEMENT_LOCATING_DEFAULT_TIMEOUT;
		//GlobalConstants.ELEMENT_LOCATING_DEFAULT_TIMEOUT = 2;
		
		return null;
	}

	@Override
	public void verifyPage() {
		// TODO Auto-generated method stub
		
	}
}
