package Sele_package;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoQA {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Prasenjit");
	
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Bhosale");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		WebElement phone = driver.findElement(By.id("userNumber"));
		phone.sendKeys("1212121212");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel = new Select(year);
		sel.selectByIndex(125);
		
		WebElement mon = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1 = new Select(mon);
		sel1.selectByValue("0");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]")).click();
		
		
		String [] subs = {"Maths","phy","co"};
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		for(String s : subs)
		{
			sub.sendKeys(s);
			sub.sendKeys(Keys.ENTER);
		}
		
		
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("Phy");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("co");
//		sub.sendKeys(Keys.ARROW_DOWN);
//		sub.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement img = driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\prase\\Downloads\\alexandar_the_great.jpg");
		
		
		
		WebElement add = driver.findElement(By.id("currentAddress"));
		add.sendKeys("hcgc");
		
		

		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);

		
		
		
		 
		   
	}

}
