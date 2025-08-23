package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguageStep {

    WebDriver driver;
    PageClass pc = new PageClass(driver);

    @Given("All Flags")
    public void all_flags() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("Click on any flag")
    public void click_on_any_flag() {
        pc = new PageClass(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        pc.lang_in();
    }

    @Then("Choosed flag")
    public void choosed_flag() {
        driver.close();
    }
}
