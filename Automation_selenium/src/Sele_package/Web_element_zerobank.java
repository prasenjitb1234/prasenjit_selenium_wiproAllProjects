package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_zerobank {

	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException {

		System.out.println("Manual test --> " + testexecution);

		WebElement user = driver.findElement(By.id("user_login"));

		user.sendKeys(user1);

		// locating password test field
		WebElement pass = driver.findElement(By.id("user_password"));

		pass.sendKeys(pass1);

		// click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		

	}
	
	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login Page ");
		
		loginStep(driver, "123456","password","Unable to Login");
		loginStep(driver, "username","789456456","Unable to Login");
		loginStep(driver, "7894fdsfs","password","Unable to Login");
		loginStep(driver, "", "", "Unable to Login");
		loginStep(driver, "username","password","Login Sucessful");
		
		
		
		
		
	}

}
