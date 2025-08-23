package Testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CrossBrowser_testing {
	WebDriver driver;
	
 
  @BeforeClass
  public void beforeClass() {
	  
  }
  
  @Test
  public void chromebrowser() throws InterruptedException {
      driver = new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
      Thread.sleep(3000);
      System.out.println("Flipkart - Thread ID : " + Thread.currentThread().getId());
      driver.quit();
  }
  
  @Test
  public void firefoxbrowser() throws InterruptedException {
      driver = new FirefoxDriver();
      driver.get("https://www.flipkart.com/");
      String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
      Thread.sleep(3000);
      System.out.println("Flipkart - Thread ID : " + Thread.currentThread().getId());
      driver.quit();
  }
  
  @Test
  public void edgebrowser() throws InterruptedException {
      System.setProperty("webdriver.edge.driver","C:\\Users\\prase\\OneDrive\\Desktop\\Selenium_jar\\msedgedriver.exe");
	  driver = new EdgeDriver();
      
      driver.get("https://www.flipkart.com/");
      String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
      String actualtitle = driver.getTitle();
      Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
      Thread.sleep(3000);
      System.out.println("Flipkart - Thread ID : " + Thread.currentThread().getId());
      driver.quit();
  }
  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
