package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {
	
	WebDriver driver;
	@Given("login page should open in default browser")
	public void login_page_should_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("page loads click on signin button")
	public void page_loads_click_on_signin_button() {
		
		driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();
	}

	@When("click on username and click continue")
	public void click_on_username_and_click_continue() throws InterruptedException {
		WebElement username = driver.findElement(By.cssSelector("input[id=\"userid\"]"));
		username.sendKeys("prasenjitbhosale1234@gmail.com");
		
		WebElement cont = driver.findElement(By.cssSelector("button[id=\"signin-continue-btn\"]"));
		cont.click();
		Thread.sleep(3000);
	}

	@When("click on password and click continue")
	public void click_on_password_and_click_continue() throws InterruptedException {
		
		
		WebElement pass = driver.findElement(By.cssSelector("input[id=\"pass\"]"));
		pass.sendKeys("bhosale@1234");
		Thread.sleep(2000);
		WebElement signinbtn = driver.findElement(By.cssSelector("button[name=\"sgnBt\"]"));
		signinbtn.click();
	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
		driver.close();
	}

}
