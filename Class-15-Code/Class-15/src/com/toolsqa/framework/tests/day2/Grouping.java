package com.toolsqa.framework.tests.day2;

import org.testng.annotations.Test;

public class Grouping {
  
  @Test(groups={"functionality", "performance"})
  public void t1() {
	  System.out.println("t1");
  }
  
  @Test(groups={"checkIn"})
  public void t2() {
	  System.out.println("t2");
  }
  
  @Test(groups={"checkIn"})
  public void t3() {
	  System.out.println("t3");
  }
  
  @Test(groups={"functionality"})
  public void t4() {
	  System.out.println("t4");
  }
  
}
