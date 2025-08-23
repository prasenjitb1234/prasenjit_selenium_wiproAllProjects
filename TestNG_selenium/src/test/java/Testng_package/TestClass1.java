package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	
  @Test
  public void amazon() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String expectedurl = "https://www.amazon.in/";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl, "Url validation fail");
		Thread.sleep(3000);
		System.out.println("Amazon -Thread ID : "+Thread.currentThread().getId());
		driver.quit();
	}
  
  
  
  
}
