package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterStep {
	WebDriver driver;
	@Given("filter page should open in default broweser")
	public void filter_page_should_open_in_default_broweser() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("search and navigate to product page")
	public void search_and_navigate_to_product_page() {
		driver.findElement(By.cssSelector("div>input[id=\"gh-ac\"]")).click();
		driver.findElement(By.cssSelector("div>input[id=\"gh-ac\"]")).sendKeys("Watch");
		driver.findElement(By.cssSelector("div>input[id=\"gh-ac\"]")).sendKeys(Keys.ENTER);
	}

	@When("Apply Filter")
	public void apply_filter() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.cssSelector("div>span>input[aria-label=\"Men\"]")).click();
		
	}

	@Then("successfully Applied Filter")
	public void successfully_applied_filter() {
		driver.close();
	}

}
