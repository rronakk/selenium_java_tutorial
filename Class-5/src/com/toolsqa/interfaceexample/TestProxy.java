package com.toolsqa.interfaceexample;

public class TestProxy implements WebSiteInterface{

	@Override
	public boolean login(String un, String pw) 
	{
		
		if(un.equals("my"))
			return true;
		
		return false;
		
	}
}
