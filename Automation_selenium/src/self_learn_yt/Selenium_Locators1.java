package self_learn_yt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Locators1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.get("http://zero.webappsecurity.com/login.html");
		
//		driver.findElement(By.id("login1")).sendKeys("abc@gmail.com");
//		
//		driver.findElement(By.name("passwd")).sendKeys("mypassword");
//		
//		driver.findElement(By.cssSelector("input[name=\"remember\"]")).click();
//		driver.findElement(By.className("signin-btn")).click();
//		
//		
//		driver.findElement(By.id("div_login_error")).getText();
		
//		driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.findElement(By.cssSelector("input[id=\"login1\"]")).sendKeys("Hello");
		
//		xpath
		
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");)
		
		
		
	}
}
