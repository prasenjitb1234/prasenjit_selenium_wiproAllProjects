package testNg_tiraBeautyTry;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClassTiraBeauty {

	WebDriver driver;

	public PageClassTiraBeauty(WebDriver driver) {
		this.driver = driver;
	}

	By Brands = By.linkText("Brands");
	By search1 = By.cssSelector("input[placeholder=\"Search Brands\"]");
	By click1 = By.linkText("DAVIDOFF");
	By selectproduct = By.linkText("Perfume");

	public void loginTiraBeauty() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.cssSelector("div[class=\"profile-icons profile-logout\"]"));
		loginBtn.click();

		Thread.sleep(1000);
		WebElement mobileNo = driver.findElement(By.name("mobile-number"));
		mobileNo.sendKeys("9422809276");
		Thread.sleep(1000);
		WebElement checkBox = driver.findElement(By.cssSelector("img[class=\"checkbox\"]"));
		checkBox.click();
		Thread.sleep(1000);
		WebElement sendOtp = driver
				.findElement(By.cssSelector("button[class=\"custom-btn primary lg no-tap-highlight\"]"));
		sendOtp.click();

		// explicit wait for manual otp
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		WebElement verifyOtp = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Verify OTP']")));
		verifyOtp.click();
	}

	public void searchMultipleItems() throws InterruptedException {
		// array
		String searches[] = { "Perfume", "Face Wash", "Baby Powder", "Shampoo" };

		for (String s : searches) {
			WebElement searchBar = driver.findElement(By.cssSelector("input[id=\"search\"]"));
			searchBar.clear();
			searchBar.sendKeys(s);
			searchBar.sendKeys(Keys.ENTER);

			Thread.sleep(3000);
		}

		driver.navigate().to("https://www.tirabeauty.com");
	}

	public void shopByCategory_in() throws InterruptedException {
		Actions act = new Actions(driver);

		WebElement men = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[6]/div/div/a"));
		act.moveToElement(men).build().perform();
		Thread.sleep(1000);

		WebElement fragrance = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[5]/div/div/a"));
		act.moveToElement(fragrance).build().perform();
		Thread.sleep(2000);

		WebElement skin = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/a"));
		act.moveToElement(skin).build().perform();
		Thread.sleep(1000);
	}

	public void addToCartRemove_in() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.navigate().to(
				"https://www.tirabeauty.com/product/minimalist-10-niacinamide-face-serum-reduces-blemishes--oil---30ml-klghrqnheu6u");

		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(1000);

		WebElement addToBag = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Add to Bag']")));
		addToBag.click();
		Thread.sleep(1000);
		WebElement cart = driver.findElement(By.cssSelector("img[title=\"Cart\"]"));
		cart.click();
		Thread.sleep(1000);
		WebElement minusButton = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".qty-control > button.operator")));
		minusButton.click();

		Thread.sleep(2000);
		WebElement removeConfirm = driver.findElement(By.cssSelector("button[class=\"remove\"]"));
		removeConfirm.click();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().to("https://www.tirabeauty.com");
	}

	public void changePersonalInfo_in() throws InterruptedException {
		WebElement profileIcon = driver
				.findElement(By.cssSelector("div.profile-icons.hover-profile > img[title=\"Profile\"]"));
		profileIcon.click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		WebElement birthDateBox = driver.findElement(By.cssSelector("input[name=\"date\"]"));
		birthDateBox.clear();
		birthDateBox.sendKeys("06/06/2003");
		Thread.sleep(2000);
		birthDateBox.sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement submitBtn = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("button.custom-btn.submit-btn.submit.lg.no-tap-highlight")));

		submitBtn.click();

		Thread.sleep(2000);
	}

	public void brands_in() throws InterruptedException {
		driver.findElement(Brands).click();
		Thread.sleep(1000);
		driver.findElement(search1).sendKeys("DAVIDOFF");
		driver.findElement(search1).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(click1).click();
		Thread.sleep(3000);
		driver.findElement(selectproduct).click();
		Thread.sleep(3000);

	}

}
