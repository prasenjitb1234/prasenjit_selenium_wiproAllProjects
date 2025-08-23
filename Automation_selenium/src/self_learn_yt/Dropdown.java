package self_learn_yt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		// click ok button
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		
		// to click on From 
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]")).click();
		
		// to select pune 
		driver.findElement(By.xpath("(//span[@class=\"ng-star-inserted\"])[1]")).click();
		
		// to click on To
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).click();
		// nagpur
		driver.findElement(By.xpath("//span[text()-'NAGPUR - NGP']")).click();
		
		
	}
}
