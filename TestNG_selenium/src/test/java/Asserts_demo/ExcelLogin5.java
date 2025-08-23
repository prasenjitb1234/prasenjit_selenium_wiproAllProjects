package Asserts_demo;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ExcelLogin5 {

	@DataProvider(name = "excelData")
	public Object[][] excelDataProvider() throws IOException {
		String excelPath = "src/test/resources/EbayLogin.xlsx";
		String sheetName = "Sheet1";

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows - 1][cols];

		for (int i = 1; i < rows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = row.getCell(j);
				data[i - 1][j] = (cell == null) ? "" : cell.toString();
			}
		}

		workbook.close();
		fis.close();
		return data;

	}

	@Test(dataProvider = "excelData")
	public void testLogin(String username, String password) {
		System.out.println("username :" + username + " | password :" + password);
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.com/");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();

		WebElement user = driver.findElement(By.cssSelector("input[id='userid']"));
		user.sendKeys(username);

		driver.findElement(By.id("signin-continue-btn")).click();

		WebElement pass = driver.findElement(By.cssSelector("input[id='pass']"));
		pass.sendKeys(password);

		WebElement signInBtn = driver.findElement(By.id("sgnBt"));
		signInBtn.click();



	}

}
