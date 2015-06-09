package com.toolsqa.framework.tests.day2;

import java.util.ArrayList;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.toolsqa.framework.GlobalConstants;
import com.toolsqa.framework.dataaccess.TextFileReader;

public class DataProviderExample {

	@Test(dataProvider = "dp")
	public void test(String n, String s) {
		System.out.println("N: " + n + " s: " + s);
	}

	@DataProvider
	public Object[][] dp() {

		// Create an array of UN and Pw elements
		// by reading them from excel

		ArrayList<String> list = TextFileReader
				.getTextFileData("C:\\Users\\Sandy\\Desktop\\dataFileOfStrings.txt");

		Object[][] objArray = new Object[list.size()][2];

		int i = 0;
		for (String s : list) {
			String[] parts = s.split(",");
			objArray[i][0] = parts[0];
			objArray[i][1] = parts[1];
			i++;
		}
		return objArray;

	}
}
