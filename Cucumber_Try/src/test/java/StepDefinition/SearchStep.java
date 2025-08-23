package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStep {
	
	WebDriver driver;
	@Given("login user and searchbar available")
	public void login_user_and_searchbar_available() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("click on searchbar")
	public void click_on_searchbar() {
		driver.findElement(By.cssSelector("div>input[id=\"gh-ac\"]")).click();
	}

	@And("Enter inputs then use keyboard enter key")
	public void enter_inputs_then_use_keyboard_enter_key() {
		driver.findElement(By.cssSelector("div>input[id=\"gh-ac\"]")).sendKeys("Watch");
		driver.findElement(By.cssSelector("div>input[id=\"gh-ac\"]")).sendKeys(Keys.ENTER);
	}

	@Then("list of output relevant to input")
	public void list_of_output_relevant_to_input() {
		driver.close();
	}

}
