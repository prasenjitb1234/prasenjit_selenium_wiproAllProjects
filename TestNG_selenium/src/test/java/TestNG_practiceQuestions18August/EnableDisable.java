package TestNG_practiceQuestions18August;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Create 2 test cases, disable one using enabled = false, and run only the active test

public class EnableDisable {

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	PageClass pg;
	
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);
		pg = new PageClass(driver, wait, actions);
		driver.get("https://www.ebay.com/");
	}

	

	@Test(priority = 1)
	public void activeTest() throws InterruptedException {
		pg.login_in();
	}

	@Test(priority = 2, enabled = false)
	public void disabledTest() {
		pg.addToCart();
	}

	@AfterClass
	public void afterClass() {
//		driver.quit();
	}
}
