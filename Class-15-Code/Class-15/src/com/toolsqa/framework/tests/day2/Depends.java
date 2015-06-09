package com.toolsqa.framework.tests.day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends {
	  
  @Test
  public void LoginToPortal() {
	  System.out.println("LoginToPortal");
	  //Assert.assertEquals(true, false);
  }

  @Test
  public void AddItemsToCart() {
	  System.out.println("AddItemsToCart");
  }
  
  @Test(dependsOnMethods={"LoginToPortal", "AddItemsToCart"})
  public void CheckOutandMakePayment() {
	  System.out.println("CheckOutandMakePayment");
  }
  
}
