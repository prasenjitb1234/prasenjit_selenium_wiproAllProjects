package Sele_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is my First Automation Script");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev");
        driver.manage().window().maximize();

        String expectedurl = "https://www.selenium.dev/";
        String actualurl = driver.getCurrentUrl();

        Thread.sleep(5000);

        if(expectedurl.equals(actualurl)) {
            System.out.println("URL validation successful");
        } else {
            System.out.println("URL validation NOT successful");
        }

        driver.close();
        System.out.println("Page Load Successfully");
    }
}
