package Sele_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebsite_Alerts {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

		Thread.sleep(2000);
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// sample alert
		WebElement sampleAlert = driver.findElement(By.partialLinkText("See an example alert"));
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(1000);
		sampleAlert.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		Thread.sleep(3000);

		// confirm alert
		WebElement confirmAlert = driver.findElement(By.partialLinkText("See a sample confirm"));
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(1000);
		confirmAlert.click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();

		Thread.sleep(3000);

		// prompt alert
		WebElement promptAlert = driver.findElement(By.partialLinkText("See a sample prompt"));
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(1000);
		promptAlert.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();

		Thread.sleep(5000);
		
	}
}