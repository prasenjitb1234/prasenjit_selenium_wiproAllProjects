package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemoQAPracticeExample {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		

		// first name
		WebElement fname = driver.findElement(By.cssSelector("input[id=\"firstName\"]"));
		fname.sendKeys("Prasenjit");

		// last name
		WebElement lname = driver.findElement(By.cssSelector("input[id=\"lastName\"]"));
		lname.sendKeys("Bhosale");
		WebElement email = driver.findElement(By.cssSelector("input[id=\"userEmail\"]"));
		email.sendKeys("prasenjit@gmail.com");

		// gender
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();
		
		js.executeScript("window.scrollBy(0,400)");

		// mobile number
		WebElement mobno = driver.findElement(By.cssSelector("input[id=\"userNumber\"]"));
		mobno.sendKeys("1234567890");

		// date of birth

		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.cssSelector("select>option[value=\"2003\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"5\"]")).click();
		driver.findElement(By.cssSelector("div[aria-label=\'Choose Friday, June 6th, 2003\']")).click();
		// subject
		String[] subs = { "Maths", "Physics", "Computer Science" };
		WebElement sub = driver.findElement(By.cssSelector("div > input[id=\"subjectsInput\"]"));
		for (String s : subs) {
			sub.sendKeys(s);
			sub.sendKeys(Keys.ENTER);
		}

		// hobbies
	
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();

		// image upload button
		WebElement img = driver.findElement(By.cssSelector("input[id=\"uploadPicture\"]"));
		img.sendKeys("C:\\Users\\prase\\Downloads\\alexandar_the_great.jpg");
		// address
		WebElement address = driver.findElement(By.cssSelector("textarea[id=\"currentAddress\"]"));
		address.sendKeys("52, abc");

		// state and city

		WebElement state = driver.findElement(By.cssSelector("input[id=\"react-select-3-input\"]"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		WebElement city = driver.findElement(By.cssSelector("input[id=\"react-select-4-input\"]"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);

		// submit
		driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();

	}
}
