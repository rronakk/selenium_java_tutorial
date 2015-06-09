package com.toolsq.javafundamentals;


// Can not inherit the class
public class FinalKeywordDemo {

	// Member is a constant
	int i=0;

	public void setI(int a)
	{
		i = a;
	}
	
	// final keyword will stop it from being overridden
	public void showMessage()
	{
		System.out.println("SuperClas");
	}
	
}
