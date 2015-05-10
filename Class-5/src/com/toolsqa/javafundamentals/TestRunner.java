package com.toolsqa.javafundamentals;

import java.util.ArrayList;

public class TestRunner {

	public static void main(String[] args) {
		
		// Java 1.7 onwards this feature is enabled
		ArrayList<TestCase> testCases = new ArrayList<>();
		
		TestCase tc1 = new FunctionalTestCase();
		TestCase tc2 = new PerformanceTestCase();
		
		testCases.add(tc1);
		testCases.add(tc2);
		testCases.add(new FunctionalTestCase());
		
		for (TestCase tc : testCases) {
			tc.setup();
			tc.run();
			tc.cleanup();
		}
	}
	
}
