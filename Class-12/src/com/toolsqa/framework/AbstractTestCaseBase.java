package com.toolsqa.framework;

public abstract class AbstractTestCaseBase implements ITestCase {

	@Override
	public void setup() {
		// Login
	}

	@Override
	public abstract void run();
	
	@Override
	public void cleanup() {
		// Logout
	}
}
