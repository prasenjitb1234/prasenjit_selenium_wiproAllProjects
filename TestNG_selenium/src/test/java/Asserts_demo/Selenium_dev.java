package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Selenium_dev {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

	}

	static boolean isTitle = true;

	@Test
	public void title() {
		String expectedtitle = "Selenium dev";
		String actualtitle = driver.getTitle();

		if (!actualtitle.equals(expectedtitle)) {
			isTitle = false;
			System.out.println("Title validation failed");
			Assert.fail("Title validation failed");
		}

		Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");
		System.out.println("Expected Title:" + expectedtitle);
		System.out.println("Actual Title:" + actualtitle);
	}

	

	@Test
	public void url() {
		if (!isTitle) {
			throw new SkipException("Skipping URL test because title test failed.");
		}
		String expectedurl = "https://www.selenium.dev/";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");
		System.out.println("Expected URL:" + expectedurl);
		System.out.println("Actual URL:" + actualurl);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
