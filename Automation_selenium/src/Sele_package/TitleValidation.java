package Sele_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is my First Automation Script");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();

		String expectedTitle = "Selenium";
		String actualTitle = driver.getTitle();
		
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);

		Thread.sleep(5000);

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title validation successful");
		} else {
			System.out.println("Title validation NOT successful");
		}

		
		
		
		
		
		driver.close();
//		System.out.println("Page Load Successfully");
	}
}
