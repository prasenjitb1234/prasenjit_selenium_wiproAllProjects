package self_learn_yt;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownDemo {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tirabeauty.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scroll(0, 1000);");
		
		
	}
}
