package Asserts_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTests {
  
  
  @Test
  public void login() {
      System.out.println("Login successful");
      Assert.assertTrue(true);
  }

  @Test(dependsOnMethods = "login")
  public void searchProduct() {
      System.out.println("Search Product successful");
  }

  @Test(dependsOnMethods = "searchProduct")
  public void logout() {
      System.out.println("Logout successful");
  }
}
