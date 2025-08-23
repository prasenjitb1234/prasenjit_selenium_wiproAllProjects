package TestNG_practiceQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_login_pageclass {

	WebDriver driver;
	PageClass pg;

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		pg = new PageClass(driver);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	// login
	@Test(priority = 1)
	public void loginEbay() throws InterruptedException {

		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		pg.email_in();
		pg.con_in();
		pg.pass_in();
		Thread.sleep(2000);
		pg.submit();

	}

	// search multiple items
	@Test(priority = 2)
	public void searchMultipleItems() throws InterruptedException {
		pg.searchMultiple_in();
	}

	// add to cart
	@Test(priority = 3)
	public void addToCartAndRemove() throws InterruptedException {

		pg.addToCart_in();

	}

	// change login name
//	@Test(priority = 4)
//	public void changeLoginName() throws InterruptedException {
//		
//		// first login
////		driver.findElement(By.linkText("Sign in")).click();
////		Thread.sleep(3000);
////		pg.email_in();
////		pg.con_in();
////		pg.pass_in();
////		Thread.sleep(2000);
////		pg.submit();
//
//		
//		// then change actual login
//		Thread.sleep(3000);
//		pg.changeLogin_in();
//
//	}

	// change current address
	@Test(priority = 5)
	public void changeCurrentAddress() throws InterruptedException {

		// first login
//		driver.findElement(By.linkText("Sign in")).click();
//		Thread.sleep(3000);
//		pg.email_in();
//		pg.con_in();
//		pg.pass_in();
//		Thread.sleep(2000);
//		pg.submit();
		
		// then actual change address method
		Thread.sleep(2000);
		pg.changeAddress_in();

	}

	// shop by category
	@Test(priority = 6)
	public void shopByCategory() throws InterruptedException {

		pg.shopByCategory_in();

	}

	// right click image of product
	@Test(priority = 7)
	public void rightClickOnProductImage() {

		pg.rightClickProductImage_in();

	}

//	  shop by all categories
	@Test(priority = 8)
	public void shopByAllCategories() throws InterruptedException {

		pg.shopByAllCategories_in();

	}

	@Test(priority = 9)
	public void languageChange() throws InterruptedException {

		pg.languageChange_in();

	}

//--------------------------------
	@AfterTest
	public void afterTest() {
		Assert.assertTrue(true, "Search functionality failed");
//	        driver.quit();
	}

}
