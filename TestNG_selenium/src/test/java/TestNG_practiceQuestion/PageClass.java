package TestNG_practiceQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {

	WebDriver driver;
	By email = By.id("userid");
	By pass = By.id("pass");
	By cont = By.id("signin-continue-btn");
	By search = By.id("gh-ac");

	By submit = By.id("sgnBt");

	public PageClass(WebDriver driver) {
		this.driver = driver;
	}

	public void email_in() {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("prasenjitbhosale1234@gmail.com");

	}

	public void pass_in() throws InterruptedException {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("bhosale@1234");
		Thread.sleep(2000);
	}

	public void con_in() throws InterruptedException {
		driver.findElement(cont).click();
		Thread.sleep(2000);
	}

	public void submit() {
		driver.findElement(submit).click();
	}

	public void searchMultiple_in() throws InterruptedException {
		String[] searches = { "Watch", "Bag", "Keyboard", "Perfume", "Phone" };

		for (String s : searches) {
			WebElement searchBar = driver.findElement(By.id("gh-ac"));
			searchBar.clear();
			searchBar.sendKeys(s);
			searchBar.sendKeys(Keys.ENTER);

			Thread.sleep(2000);
			
		}
		Thread.sleep(1000);
		driver.navigate().to("https://www.ebay.com/");
	}

	public void addToCart_in() throws InterruptedException {
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
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.ebay.com/");
	}

//	public void changeLogin_in() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My eBay"))).click();
//		// account section
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();
//		// personal info section
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Personal information"))).click();
//
//		Actions act = new Actions(driver);
//
////		WebElement accountBtn = driver
////				.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div/div/div[2]/div/div/ul/li[3]/a"));
////		act.moveToElement(accountBtn).build().perform();
//		
//		WebElement passAgain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
//		passAgain.clear();
//		passAgain.sendKeys("bhosale@1234");
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("sgnBt"))).click();
//		
//		driver.findElement(By.linkText("Personal information")).click();
//
//		// edit button
//		driver.findElement(By.cssSelector("button[id=\"individual_username_edit_button\"]")).click();
//
//		// enter user name
//		WebElement username = driver.findElement(By.cssSelector("input[id=\"user_name\"]"));
//		username.sendKeys("prasenjit1234");
//		// save button
//		driver.findElement(By.cssSelector("button[id=\"username_submit_edit_btn\"]")).click();
//	}
	
	public void changeLogin_in() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	   
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My eBay"))).click();
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();

	    
	    wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[normalize-space()='Personal information']"))).click();
	    
	    WebElement personalInfo = driver.findElement(By.xpath("//*[@id=\"account-settings-link-PI\"]"));
	    personalInfo.click();
	    //  password
	    WebElement passAgain = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
	    passAgain.clear();
	    passAgain.sendKeys("bhosale@1234");
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("sgnBt"))).click();

	    // back to personal info section
	    wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//span[normalize-space()='Personal information']"))).click();

	    //  Edit username
	    wait.until(ExpectedConditions.elementToBeClickable(
	        By.id("individual_username_edit_button"))).click();

	    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.id("user_name")));
	    username.clear();
	    username.sendKeys("prasenjit1234");

	    wait.until(ExpectedConditions.elementToBeClickable(
	        By.id("username_submit_edit_btn"))).click();
	}


	public void changeAddress_in() throws InterruptedException {
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
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.ebay.com/");

	}

	public void shopByCategory_in() throws InterruptedException {
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
		Thread.sleep(1000);
		driver.navigate().to("https://www.ebay.com/");
	}

	public void shopByAllCategories_in() throws InterruptedException {
		// all categories button - > selecting art category using parent child selector
		WebElement allCategories = driver.findElement(By.cssSelector("select>option[value=\"550\"]"));
		allCategories.click();

		Thread.sleep(1000);

		// search button
		WebElement searchBtn = driver.findElement(By.id("gh-ac"));
		searchBtn.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.ebay.com/");
	}

	public void rightClickProductImage_in() {
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

	public void languageChange_in() throws InterruptedException {

//		flag country change language

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		driver.findElement(By.linkText("Spain")).click();
	}

}
