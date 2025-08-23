package TestNG_practiceQuestions18August;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

//4 . Write dependent test cases:
//
//login()
//
//search Product() (depends on login)
//
//logout() (depends on login)

public class LoginSearchLogoutDependant {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@Test(priority=1)
	@Parameters({ "username", "password" })
	public void loginEbay(String username, String password) throws InterruptedException {

		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();

		Thread.sleep(3000);
		WebElement user = driver.findElement(By.cssSelector("input[id='userid']"));
		user.sendKeys(username);
		user.sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='pass']")));
		pass.sendKeys(password);

		Thread.sleep(2000);

		WebElement signInBtn = driver.findElement(By.id("sgnBt"));
		signInBtn.click();

	}

	@Test(dependsOnMethods = { "loginEbay" }, priority=2)
	public void searchProduct() throws InterruptedException {
		WebElement search = driver.findElement(By.id("gh-ac"));
		search.clear();
		search.sendKeys("phone");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
	}

	@Test(dependsOnMethods = { "loginEbay" }, priority=3)
	public void logout() {
		Actions act = new Actions(driver);

		WebElement accountMenu = driver
				.findElement(By.cssSelector("button[class=\"gh-flyout__target gh-flyout__target--left\"]"));

		act.moveToElement(accountMenu).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement signOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
		signOut.click();
	}

	@AfterClass
	public void afterClass() {
//		driver.quit();
	}
}
