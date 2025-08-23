package Sele_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LoginDemo {

	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution)
			throws InterruptedException {

		System.out.println("Manual test --> " + testexecution);

		Thread.sleep(3000);
		WebElement user = driver.findElement(By.name("username"));

		user.sendKeys(user1);

		WebElement pass = driver.findElement(By.name("password"));

		pass.sendKeys(pass1);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		Thread.sleep(3000);
		// navigate back to login page for next test data
		driver.navigate().refresh();
		Thread.sleep(2000);

		
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n" + " ");
		Thread.sleep(5000);
		System.out.println("Welcome to ORange HRM ");

		loginStep(driver, "Admin", "admin123", "Login Successful");

	}
}
