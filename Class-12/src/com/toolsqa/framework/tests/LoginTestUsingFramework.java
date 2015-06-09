package com.toolsqa.framework.tests;

import com.toolsqa.framework.AbstractTestCaseBase;
import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.pageobjectmodel.StoreLoggedInPage;
import com.toolsqa.framework.pageobjectmodel.StoreLoginPage;

public class LoginTestUsingFramework extends AbstractTestCaseBase{

	
	@Override
	public void run() {
		
		
		StoreLoginPage loginPage = new StoreLoginPage();
		loginPage.verifyPage();
		
		loginPage.setUserName(GlobalConstants.VALID_USERNAME);
		loginPage.setPassword(GlobalConstants.VALID_PASSWORD);
		
		//StoreLoggedInPage loggedInPage = loginPage.clickLoginButton();
				

		loginPage.login(GlobalConstants.VALID_USERNAME,
				GlobalConstants.VALID_PASSWORD);
	}

}
