package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopByCategoryStep {

    WebDriver driver;

    @Given("Page opens in ebay website")
    public void page_opens_in_ebay_website() {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @When("page loads click on shopbycategory")
    public void page_loads_click_on_shopbycategory() {
        driver.findElement(By.cssSelector("div>button>span[class=\"gh-categories__title\"]")).click();
    }

    @And("click on computers and navigate back")
    public void click_on_computers_and_navigate_back() throws InterruptedException {
        WebElement comp = driver.findElement(
            By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[1]")
        );

        Actions act = new Actions(driver);
        act.moveToElement(comp).click().perform();

        Thread.sleep(3000);

        driver.navigate().back();
        driver.findElement(By.cssSelector("div>button>span[class=\"gh-categories__title\"]")).click();
        Thread.sleep(2000);
    }

    @And("click on cameras and navigate back")
    public void click_on_cameras_and_navigate_back() throws InterruptedException {
        WebElement cam = driver.findElement(
            By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[4]")
        );

        Actions act = new Actions(driver);
        act.moveToElement(cam).click().perform();

        Thread.sleep(2000);

        driver.navigate().back();
        driver.findElement(By.cssSelector("div>button>span[class=\"gh-categories__title\"]")).click();
    }

    @And("click on video games and navigate back")
    public void click_on_video_games_and_navigate_back() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.cssSelector("div>button>span.gh-categories__title")).click();

        WebElement games = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Video Games & Consoles']"))
        );

        games.click();

        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("div>button>span.gh-categories__title"))
        ).click();
    }

    @Then("successfully shop by category is working")
    public void successfully_shop_by_category_is_working() {
        driver.close();
    }
}
