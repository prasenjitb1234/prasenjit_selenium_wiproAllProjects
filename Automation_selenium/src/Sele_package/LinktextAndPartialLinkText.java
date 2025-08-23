package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextAndPartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=cocomelon");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.linkText("Baby Shark | @CoComelon Nursery Rhymes & Kids Songs")).click();
		driver.findElement(By.partialLinkText("Humpty Dumpty")).click();
		
	    // select 
//	    WebElement select = driver.findElement(By.cssSelector("button[value=\"Select\"]"));
//	    select.click();
//	    select.sendKeys(Keys.ENTER);
		
		
	}
}
