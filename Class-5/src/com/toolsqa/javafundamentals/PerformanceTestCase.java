package com.toolsqa.javafundamentals;

public class PerformanceTestCase implements TestCase {

	@Override
	public void setup() {
		System.out.println("PT : Setup");
	}

	@Override
	public void run() {
		System.out.println("PT : Run");
	}

	@Override
	public void cleanup() {
		System.out.println("PT : Cleanup");
	}

}
