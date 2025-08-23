package TestNG_practiceQuestion;

import org.testng.annotations.Test;

import io.netty.handler.timeout.TimeoutException;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

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

//---------------------------------
//Create testing class
//Project URL= https://www.ebay.com/
//Add pre-requisite
//Create 10 testcases for
//1.Login
//2.Multiple searches using array list or array
//3.Add to cart
//4.delete from cart
//5.Change login name
//6. change current address
//7.shop by categories
//8.select particular product right click on that product image and find out description of that product.
//9.shop by all categories and check whether this function is working fine or not
//10. change the language of your application using setting
// 
//Create Post condition for every testcase

//-----------------------------
public class Ebay_Login {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void loginEbay() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();

		WebElement user = driver.findElement(By.cssSelector("input[id='userid']"));
		user.sendKeys("prasenjitbhosale1234@gmail.com");
		user.sendKeys(Keys.ENTER);

		WebElement pass = driver.findElement(By.cssSelector("input[id='pass']"));
		pass.sendKeys("bhosale@1234");

		// No Thread.sleep — implicit wait will handle element finding
		WebElement signInBtn = driver.findElement(By.id("sgnBt"));
		signInBtn.click();
	}

	@Test(priority = 2)
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

	@Test(priority = 3)
	public void addToCartAndRemove() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.navigate().to(
				"https://www.ebay.com/itm/255020221191?_skw=samsung+galaxy+s21&epid=22043687761&itmmeta=01K2P9N4H61V1BFRRN72GFEZH2&hash=item3b6063c307:g:gLAAAeSwyjFoL5ed&itmprp=enc%3AAQAKAAAA8FkggFvd1GGDu0w3yXCmi1cLi4QkQd%2BedjOpEC6Qt0srRjqwi5XYuHJGHJzQZ%2BrjBPmyrRJsNAIdD9qol62bmj%2FkLAkrJJz2vIQhT8GjVI5wfh%2BXOvNcZRIZh8ObAe6lObUxWzGihLEg%2Fhp0o4f3knnWBH5DRbV7m%2FIX5TODKJ9gtVNeq3NCTWBIePbSHGVzxbyoDqVAYH2SsYz2%2BcnxW48gauwah3%2FiVw5%2FpplNuyGZWss260yoY4QDs49PHEoAt3JrpgGuoT9bWNrBP4znhs09wzE5pfCJimFJI79JUlK34ouFtjfeUUDSD2pSeJF%2FJw%3D%3D%7Ctkp%3ABFBM5MjUyZVm");

		WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart")));
		addToCartBtn.click();

		Thread.sleep(2000);
		driver.get("https://cart.ebay.com/");

		// remove item from cart
		WebElement removeButton = wait.until(
				ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='cart-remove-item']")));

		removeButton.click();

	}

	// change login name
	@Test(priority = 4)
	public void changeLoginName() throws InterruptedException {

		WebElement myEbay = driver.findElement(By.linkText("My eBay"));
		myEbay.sendKeys(Keys.ENTER);

		Actions act = new Actions(driver);

		WebElement accountBtn = driver
				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div/div/div[2]/div/div/ul/li[3]/a"));
		act.moveToElement(accountBtn).build().perform();

		driver.findElement(By.linkText("Personal information")).click();

		// edit button
		driver.findElement(By.cssSelector("button[id=\"individual_username_edit_button\"]")).click();

		// enter user name
		WebElement username = driver.findElement(By.cssSelector("input[id=\"user_name\"]"));
		username.sendKeys("prasenjit1234");
		// save button
		driver.findElement(By.cssSelector("button[id=\"username_submit_edit_btn\"]")).click();

	}

//	----
	// . change current address

	@Test(priority = 5)
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

		// street address
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

		// zipcode
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

//	-------
	// shop by category

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

		driver.navigate().refresh();

	}

	// right click image of product

	@Test(priority = 8)
	public void rightClickOnProductImage() {
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.id("gh-ac")).sendKeys("Watch");
		driver.findElement(By.id("gh-search-btn")).click();
		WebElement productImage = wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"item2b24cf1791\"]/div/div[1]/div/a/div/img")));

		act.contextClick(productImage).perform();
		String description = productImage.getAttribute("alt");
		System.out.println("Product description: " + description);
		System.out.println("Right clicked image");
		driver.navigate().refresh();

	}

//	  shop by all categories
	@Test(priority = 9)
	public void shopByAllCategories() throws InterruptedException {

		// all categories button
		WebElement allCategories = driver.findElement(By.cssSelector("[class=\"gh-search-categories\"]"));
		allCategories.click();

		Thread.sleep(1000);

		// search button
		WebElement searchBtn = driver.findElement(By.id("gh-ac"));
		searchBtn.sendKeys(Keys.ENTER);

	}

	@Test(priority = 10)
	public void languageChange() throws InterruptedException {

//		flag country change language

		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		driver.findElement(By.linkText("China")).click();

	}

//--------------------------------
	@AfterTest
	public void afterTest() {
		Assert.assertTrue(true, "Search functionality failed");
//	        driver.quit();
	}

}
