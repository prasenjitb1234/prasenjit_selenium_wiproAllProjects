package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RightClickStep {
    WebDriver driver;
    PageClass pc = new PageClass(driver);

    @Given("Ebay WebPage on browser")
    public void ebay_webpage_on_browser() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("Click on  product")
    public void click_on_product() {
        pc = new PageClass(driver);
        pc.product_in();
    }

    @When("Right click on product image")
    public void right_click_on_product_image() throws InterruptedException {
        pc = new PageClass(driver);
        pc.right_in();
    }

    @Then("Product is Displayed")
    public void product_is_displayed() {
        driver.close();
    }
}
