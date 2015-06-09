package com.toolsqa.framework.tests.day2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_D2_001 {
	
 @BeforeMethod
 public void setup()
 {
	 Assert.assertEquals(true, false);
 }
	
	@Test
  public void one1() {
	  System.out.println("TestNG_D2_001 - One1");
  }
  
  
  @Test(priority=-1)
  public void one2() {
	  System.out.println("TestNG_D2_001 - One2");
  }
  
  @Test(priority=4)
  public void two() {
	  System.out.println("TestNG_D2_001 - two");
  }
  
  @Test(priority=3)
  public void three() {
	  System.out.println("TestNG_D2_001 - three");
  }
  
  @Test(priority=4)
  public void four() {
	  System.out.println("TestNG_D2_001 - four");
	  
  }
  
}
