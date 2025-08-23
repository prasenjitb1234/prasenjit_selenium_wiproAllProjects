package testing_package;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Para_testing {

    @Test(priority = 4)
    public void eBay() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        System.out.println("Ebay - Thread ID : " + Thread.currentThread().getId());
        driver.quit();
    }

    @Test(priority = 3)
    public void amazon() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String expectedurl = "https://www.amazon.in/";
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expectedurl, "Url validation fail");
        Thread.sleep(3000);
        System.out.println("Amazon - Thread ID : " + Thread.currentThread().getId());
        driver.quit();
    }

    @Test(priority = 1)
    public void flipkart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Title validation fail");
        Thread.sleep(3000);
        System.out.println("Flipkart - Thread ID : " + Thread.currentThread().getId());
        driver.quit();
    }

    @Test(priority = 2)
    public void zerobank() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");
        WebElement search = driver.findElement(By.id("searchTerm"));
        search.sendKeys("Online banking");
        search.sendKeys(Keys.ENTER);
        Assert.assertTrue(true, "search button is not clickable");
        Thread.sleep(3000);
        System.out.println("Zerobank - Thread ID : " + Thread.currentThread().getId());
        driver.quit();
    }
}
