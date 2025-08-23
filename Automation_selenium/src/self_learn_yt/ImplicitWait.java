package self_learn_yt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://in.bookmyshow.com/explore/movies-pune");
		driver.manage().window().maximize();

		// implicit wait

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// explicit wait
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//div[text()='Marathi'])[3]")).click();

//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Dhaap']")));

		driver.findElement(By.xpath("//img[@alt='Dhaap']")).click();

		driver.navigate().back();

		driver.findElement(By.xpath("(//div[text()='English'])[3]")).click();

//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='F1: The Movie']")));

		driver.findElement(By.xpath("//img[@alt='F1: The Movie']")).click();

		// fluent wait
		

	}
}
