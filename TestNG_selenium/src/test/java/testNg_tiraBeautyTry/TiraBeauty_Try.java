package testNg_tiraBeautyTry;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

// login
// change personal info
// add to cart 
// delete from cart 
// search multiple items
// shop by category

public class TiraBeauty_Try {

	WebDriver driver;
	PageClassTiraBeauty pg;

	@BeforeTest
	public void beforeTest() throws InterruptedException {

		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.get("https://www.tirabeauty.com");
		pg = new PageClassTiraBeauty(driver);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
//  -----------------

	// search multiple items

	@Test(priority = 1)
	public void loginTira() throws InterruptedException {

		pg.loginTiraBeauty();

	}

	@Test(priority = 2)
	public void searchMultiple() throws InterruptedException {

		pg.searchMultipleItems();
	}

	// add to cart and remove
	@Test(priority = 3)
	public void addToCartAndRemove() throws InterruptedException {

		pg.addToCartRemove_in();

	}

	// shop by category
	@Test(priority = 4)
	public void shopByCategory() throws InterruptedException {

		pg.shopByCategory_in();

	}

	// change personal info

	@Test(priority = 5)
	public void changePersonalInfo() throws InterruptedException {

		// first login
		pg.loginTiraBeauty();

		Thread.sleep(2000);
		// then actual change info
		pg.changePersonalInfo_in();

	}

	// search single item

//	@Test
//	public void search() throws InterruptedException {
//		WebElement search = driver.findElement(By.cssSelector("input[id=\"search\"]"));
//		search.clear();
//		search.sendKeys("Niacinamide Serum");
//		Thread.sleep(1000);
//		search.sendKeys(Keys.ENTER);
//		
//	}

	@Test(priority=6)
	public void brand() throws InterruptedException {
		pg.brands_in();
	}
	
	

//	---------- change address not working at this point --------------
//	@Test
//	public void changeAddress() throws InterruptedException {
//
//		pg.loginTiraBeauty();
//
//		Thread.sleep(2000);
//		WebElement addressButton = driver.findElement(By.cssSelector("img[alt=\"Addresses\"]"));
//		addressButton.click();
//
//		WebElement editBtn = driver.findElement(By.cssSelector("img[class=\"edit-btn\"]"));
//		editBtn.click();
//		Thread.sleep(2000);
//		WebElement houseNo = driver.findElement(By.cssSelector("input[name=\"address\"]"));
//		houseNo.sendKeys("50");
//		WebElement buildingOrStreetName = driver.findElement(By.cssSelector("input[name=\"area\"]"));
//		buildingOrStreetName.sendKeys("M.K. Gandhi Road");
//
//		Thread.sleep(2000);
//		WebElement pinCode = driver.findElement(By.cssSelector("input[name=\"pincode.name\"]"));
//		pinCode.sendKeys("415001");
//
//		driver.findElement(By.cssSelector("img[class=\"checkbox\"]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//	}

//----------------------
	@AfterTest
	public void afterTest() {
//		driver.quit();
	}

}
