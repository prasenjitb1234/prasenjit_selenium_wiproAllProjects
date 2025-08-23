package TestNG_practiceQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class whateverWorksPutHere {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void loginEbay() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
		Thread.sleep(3000);

		WebElement user = driver.findElement(By.cssSelector("input[id=\"userid\"]"));
		user.sendKeys("prasenjitbhosale1234@gmail.com");
		user.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.cssSelector("input[id=\"pass\"]"));
		pass.sendKeys("bhosale@1234");
		pass.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("div>button[id=\"sgnBt\"]")).click();
		driver.findElement(By.id("sgnBt")).click();

		Thread.sleep(1000);

		// skip cancel button
//		driver.findElement(By.cssSelector("a[ id=\"passkeys-cancel-btn\"]")).click();

	}
	
	@Test(priority = 3)
	public void searchMultipleItems() throws InterruptedException {
		String[] searches = { "Watch", "Bag", "Keyboard", "Perfume", "Phone" };

		for (String s : searches) {
			WebElement searchBar = driver.findElement(By.id("gh-ac"));
			searchBar.clear();
			searchBar.sendKeys(s);
			searchBar.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
		}
	}

	@Test(priority = 2)
	public void changeCurrentAddress() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// my Ebay
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My eBay"))).click();
		// account section
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();
		// personal info section
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Personal information"))).click();

		WebElement passAgain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		passAgain.clear();
		passAgain.sendKeys("bhosale@1234");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sgnBt"))).click();

		// edit address button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("individual_personal_info_address_edit_button")))
				.click();

		// country select
		WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
		new Select(countryDropdown).selectByVisibleText("India");
		Thread.sleep(1000);

		// street addresss
		WebElement streetAddress = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[aria-label='Street address']")));
		streetAddress.clear();
		streetAddress.sendKeys("52, M.K Gandhi Road");
		Thread.sleep(1000);

		// street address 2
		WebElement streetAddressOptional = driver.findElement(By.id("streetAddressOptional"));
		streetAddressOptional.clear();
		streetAddressOptional.sendKeys("optional Address random");
		Thread.sleep(1000);

		// city
		WebElement city = driver.findElement(By.id("city"));
		city.clear();
		city.sendKeys("Pune");
		Thread.sleep(1000);

		// zip code
		WebElement zipcode = driver.findElement(By.id("postalCode"));
		zipcode.clear();
		zipcode.sendKeys("415001");
		Thread.sleep(1000);

		// state
		WebElement stateDropdown = driver.findElement(By.id("stateOrProvince"));
		new Select(stateDropdown).selectByValue("MH");
		Thread.sleep(1000);

		// submit button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("address_edit_submit_button"))).click();
	}
	

	@Test(priority = 7)
	public void shopByCategory() throws InterruptedException {

		WebElement shopCategory = driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span"));
		shopCategory.click();

		Thread.sleep(100);
		// computer & tablet
		WebElement CompTab = driver
				.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[1]"));
		CompTab.sendKeys(Keys.ENTER);

		Thread.sleep(1000);

		WebElement shopCategory1 = driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span"));
		shopCategory1.click();
		// camera
		WebElement Camera = driver
				.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[4]"));
		Camera.sendKeys(Keys.ENTER);

	}

	@AfterTest
	public void afterTest() {
		Assert.assertTrue(true, "Search functionality failed");
//	        driver.quit();
	}

}
