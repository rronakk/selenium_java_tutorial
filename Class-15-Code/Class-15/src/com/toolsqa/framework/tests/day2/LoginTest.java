package com.toolsqa.framework.tests.day2;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.toolsqa.framework.dataaccess.ExcelReader;

public class LoginTest {
	
  @Test
  @Parameters({"un", "pw"})
  public void run(String un, String pw) {
	  
	  System.out.println("UN: "+un);
	  System.out.println("PW: "+pw);
  }
  
  @Test
  @Parameters({"abc", "def"})
  public void run1(String abc, String def) {
	  
	  System.out.println("UN: "+abc);
	  System.out.println("PW: "+def);
  }
  
  @Test
  @Parameters({"excelFilePath", "sheetName"})
  public void run3(String excelFilePath, String sheetName) throws IOException {
	  
	  ExcelReader er = new ExcelReader();
	  er.getExcelData(excelFilePath, sheetName, 1, 1);
	  
  }
  
}
