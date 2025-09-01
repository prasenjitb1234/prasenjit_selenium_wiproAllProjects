package TestPractice;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTestPractice {

	@DataProvider(name = "excelData")
	public Object[][] excelDataProvider() throws IOException {
		String excelPath = "src/test/resources/LoginData.xlsx";
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
		System.out.println("username : " + username + " |  password : " + password);

		WebDriver driver = new ChromeDriver();

		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("user_login"));
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_password"));
		driver.findElement(By.id("user_password")).sendKeys(password);

		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

}
