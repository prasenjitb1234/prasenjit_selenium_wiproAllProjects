package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopAllCategoriesStep {

	WebDriver driver;
	@Given("Page opens in ebay all categories")
	public void page_opens_in_ebay_all_categories() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("page loads click on All Categories")
	public void page_loads_click_on_all_categories() {
		driver.findElement(By.cssSelector("select[class=\"gh-search-categories\"]")).click();
		driver.findElement(By.cssSelector("button>span[class=\"gh-search-button__label\"]")).click();
	}

	@And("select one category and press enter")
	public void select_one_category_and_press_enter() {
		driver.findElement(By.cssSelector("select>option[value=\"550\"]")).click();
	}

	@Then("successfully Shop By All category is working")
	public void successfully_shop_by_all_category_is_working() {
		driver.close();
	}

}
