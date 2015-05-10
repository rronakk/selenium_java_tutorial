package com.toolsqa.interfaceexample;

public class TestRunner1 {

	public static void main(String[] args) {
		
		
		WebSiteInterface web = new TestProxy();
		
		boolean result = web.login("my", "my");
		
		if(result==false)
			System.out.println("Test Failed");
		else 
			System.out.println("Test Passed");
		
	}
}
