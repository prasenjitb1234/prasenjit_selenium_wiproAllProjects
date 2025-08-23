package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartAndRemoveStep {
	WebDriver driver;
	@Given("Page should open in default browser")
	public void page_should_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Page loads navigate to product page")
	public void page_loads_navigate_to_product_page() {
//		driver.navigate().to("https://www.ebay.com/itm/255020221191?_skw=samsung+galaxy+s21&epid=22043687761&itmmeta=01K2P9N4H61V1BFRRN72GFEZH2&hash=item3b6063c307:g:gLAAAeSwyjFoL5ed&itmprp=enc%3AAQAKAAAA8FkggFvd1GGDu0w3yXCmi1cLi4QkQd%2BedjOpEC6Qt0srRjqwi5XYuHJGHJzQZ%2BrjBPmyrRJsNAIdD9qol62bmj%2FkLAkrJJz2vIQhT8GjVI5wfh%2BXOvNcZRIZh8ObAe6lObUxWzGihLEg%2Fhp0o4f3knnWBH5DRbV7m%2FIX5TODKJ9gtVNeq3NCTWBIePbSHGVzxbyoDqVAYH2SsYz2%2BcnxW48gauwah3%2FiVw5%2FpplNuyGZWss260yoY4QDs49PHEoAt3JrpgGuoT9bWNrBP4znhs09wzE5pfCJimFJI79JUlK34ouFtjfeUUDSD2pSeJF%2FJw%3D%3D%7Ctkp%3ABFBM5MjUyZVm");
		driver.navigate().to("https://www.ebay.com/itm/406057140578?_skw=casio&itmmeta=01K35NS9M2KFNPH217X2EHZTCZ&hash=item5e8ae44162:g:pZoAAeSwr61nt9qF&itmprp=enc%3AAQAKAAAAwFkggFvd1GGDu0w3yXCmi1f8bTb7c9dBs3Q7MPWVoGjmGvPDopWubZMMvF6yF4UBycil%2FRg%2FQTbJ1hvhmq%2BVmtTUw6frT9QU3Zk5rm%2FZkNuRlWTJa9a%2FQsvjmqJPil3Zxa32n07hKkubCIgrAvFd2omlyN4cNetZSC3ppnG29VxluypUYzOn6YX0HRHWyZc5whYGkkZLd74CvD5HU0j0K9gBLdp89xAZE%2FJPupOgrfs7dndF3yV3aEiy9s%2BJsbMfEA%3D%3D%7Ctkp%3ABk9SR6ia5bWZZg");
		
	}

	@And("Add item to cart")
	public void add_item_to_cart() throws InterruptedException {
		driver.findElement(By.cssSelector("div>a[id=\"atcBtn_btn_1\"]")).click();
		Thread.sleep(2000);
	}

	@And("Go to Cart page")
	public void go_to_cart_page() {
		driver.navigate().to("https://cart.ebay.com/");
	}
	
	@And("remove item from cart")
	public void remove_item_from_cart() {
	    driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
	}
	@Then("removed item successfully")
	public void removed_item_successfully() {
	    driver.close();
	}

	

}
