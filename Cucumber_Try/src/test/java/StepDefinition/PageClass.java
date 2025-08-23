package StepDefinition;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {

	WebDriver driver;

	// login
	By login = By.linkText("Sign in");
	By email = By.id("userid");
	By pass = By.id("pass");
	By cont = By.id("signin-continue-btn");
	By submit = By.id("sgnBt");

	// search
	By search = By.id("gh-ac");
	// language

	// add tocartand remove
	By addcart = By.cssSelector("a[id=\"atcBtn_btn_1\"]");
	By seecart = By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]");
	By remove = By.cssSelector("button[data-test-id=\"cart-remove-item\"]");

	// address
	By address = By.cssSelector("a[href=\"https://accountsettings.ebay.com/uas/addresses\"]");
	By edit = By.cssSelector(
			"a[aria-label=\"Edit Registration address, email and phone number opens in new window or tab.\"]");
	By editbtn = By.cssSelector("button[id=\"individual_personal_info_address_edit_button\"]");
	By country = By.cssSelector("select>option[value=\"IN\"]");
	By change = By.cssSelector("input[aria-label=\"Street address\"]");

	// loginname
	By personal = By.cssSelector("a[href=\"https://accountsettings.ebay.com/profile\"]");
	By edit1 = By.cssSelector("button[id=\"individual_username_edit_button\"]");
	By username = By.cssSelector("input[aria-describedby=\"user_name-inline_error\"]");

	// shop-by-category
	By shopcat = By.cssSelector("span[class=\"gh-categories__title\"]");
	By autopart = By.cssSelector("a[href=\"https://www.ebay.com/b/Auto-Parts-Accessories/6028/bn_569479\"]");
	By select = By.cssSelector("img[src=\"https://i.ebayimg.com/thumbs/images/g/qpoAAeSwuKNok19K/s-l1600.webp\"]");

	// all-category
	By allcat = By.cssSelector("select>option[value=\"550\"]");
	By search1 = By.cssSelector("span[class=\"gh-search-button__label\"]");

	// language
	By lang = By.cssSelector("button[class=\"gf-flag__button\"]");
	By country1 = By.linkText("China");

	By country2 = By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button");
	By flag = By.linkText("China");

	// right click
	By searchp = By.id("gh-ac");
	By searchbtn = By.id("gh-search-btn");
	By product = By.xpath("//*[@id=\"item2b24cf1791\"]/div/div[1]/div/a/div/img");

	// filter
	By send = By.id("gh-ac");
	By depatment = By.cssSelector("input[aria-label=\"Men\"]");
	By brand = By.cssSelector("input[aria-label=\"Rolex\"]");
	By brandmaterial = By.cssSelector("input[aria-label=\"Leather\"]");

	public PageClass(WebDriver driver) {
		this.driver = driver;

	}

	public void login() {
		driver.findElement(login).click();

	}

	public void email_in() {
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("prasenjitbhosale1234@gmail.com");

	}
	
	public void right_in() throws InterruptedException {
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement productImage = wait.until(ExpectedConditions
				.presenceOfElementLocated(product));

		act.contextClick(productImage).perform();
		String description = productImage.getAttribute("alt");
		Thread.sleep(2000);
		System.out.println("Product description: " + description);
		System.out.println("Right clicked image");
		driver.navigate().refresh();
	}

	public void con_in() {
		driver.findElement(cont).click();

	}

	public void pass_in() {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("bhosale@1234");

	}

	public void submit() {
		driver.findElement(submit).click();
	}

	public void lang_in() {
		Actions act = new Actions(driver);

		WebElement hover = driver.findElement(lang);
		act.moveToElement(hover).perform();

		driver.findElement(country1).click();
	}

	public void search_in() {
		driver.findElement(search).click();

	}

	public void addtocart_in() throws InterruptedException {
		driver.findElement(addcart).click();

	}

	public void seecart_in() {
		driver.findElement(seecart).click();
	}

	public void removecart_in() throws InterruptedException {

		driver.findElement(remove).click();
	}

	public void address_in() {
		driver.findElement(address).click();
		;

	}

	public void description() throws InterruptedException {
		driver.navigate().to(
				"https://www.ebay.com/itm/406057140578?_skw=casio&itmmeta=01K35NS9M2KFNPH217X2EHZTCZ&hash=item5e8ae44162:g:pZoAAeSwr61nt9qF&itmprp=enc%3AAQAKAAAAwFkggFvd1GGDu0w3yXCmi1f8bTb7c9dBs3Q7MPWVoGjmGvPDopWubZMMvF6yF4UBycil%2FRg%2FQTbJ1hvhmq%2BVmtTUw6frT9QU3Zk5rm%2FZkNuRlWTJa9a%2FQsvjmqJPil3Zxa32n07hKkubCIgrAvFd2omlyN4cNetZSC3ppnG29VxluypUYzOn6YX0HRHWyZc5whYGkkZLd74CvD5HU0j0K9gBLdp89xAZE%2FJPupOgrfs7dndF3yV3aEiy9s%2BJsbMfEA%3D%3D%7Ctkp%3ABk9SR6ia5bWZZg");
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(product).click();

	}

	public void lang() {
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebElement con = driver.findElement(country);
		act.moveToElement(con).perform();
		driver.findElement(flag).click();
		;

	}

	public void changeadd_in() throws InterruptedException {
		driver.findElement(edit).click();
		Thread.sleep(1000);
		driver.findElement(editbtn).click();
		Thread.sleep(1000);
		driver.findElement(country).click();
		Thread.sleep(1000);
		driver.findElement(change).clear();
		Thread.sleep(1000);
		driver.findElement(change).sendKeys("sec 7");
		driver.findElement(change).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void personal_in() {
		driver.findElement(personal).click();
	}

	public void editusername_in() {
		driver.findElement(edit1).click();
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("anish_85");
		driver.findElement(username).sendKeys(Keys.ENTER);
	}

	public void shopbycategory_in() throws InterruptedException {
		driver.findElement(shopcat).click();
		Thread.sleep(2000);

	}

	public void autopart_in() throws InterruptedException {
		driver.findElement(autopart).click();
		Thread.sleep(2000);
		driver.findElement(select).click();
		Thread.sleep(2000);
	}

	public void all_category() throws InterruptedException {
		driver.findElement(allcat).click();
		Thread.sleep(2000);

	}

	public void searchbtn_in() throws InterruptedException {
		driver.findElement(search1).click();
		Thread.sleep(2000);
	}

	public void product_in() {
		driver.findElement(searchp).click();
		driver.findElement(searchp).sendKeys("Watch");
		driver.findElement(searchbtn).click();
	}

	

	public void send_in() {
		driver.findElement(send).sendKeys("watch");
	}

	public void filter_in() {
		driver.findElement(depatment).click();
		driver.findElement(brand).click();
		driver.findElement(brandmaterial).click();
	}
}
