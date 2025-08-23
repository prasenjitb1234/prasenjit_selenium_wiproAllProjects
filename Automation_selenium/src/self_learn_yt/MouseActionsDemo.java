package self_learn_yt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// hover 
		Actions act = new Actions(driver);
		 
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		act.moveToElement(element).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/ul/li[6]/div/a"))).click().build().perform();
		
		driver.navigate().back();
		
		//
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().sendKeys("Pen Driver").doubleClick().build().perform();
		
		
		
		
		
		
	}
}
