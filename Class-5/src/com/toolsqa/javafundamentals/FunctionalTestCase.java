package com.toolsqa.javafundamentals;

public class FunctionalTestCase implements TestCase {

	public void setup()
	{
		System.out.println("FT : Setup");
	}

	public void run() {
		
		System.out.println("FT : RUN");
		
	}

	public void cleanup() {
		
		System.out.println("FT : CLEAN");
		
	}
		
}
