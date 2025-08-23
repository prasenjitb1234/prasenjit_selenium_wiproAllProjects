package Testng_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTestSearch {
	@DataProvider(name = "excelData")
	public Object[][] excelDataProvider() throws IOException {
		String excelPath = "src/test/resources/LoginData.xlsx";
		String sheetName = "Sheet2";

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
	public void testLogin(String search) {
		System.out.println("search : " + search);
		WebDriver driver = new ChromeDriver();

		driver.get("http://zero.webappsecurity.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("searchTerm")).click();
		WebElement searchbox = driver.findElement(By.id("searchTerm"));
		searchbox.sendKeys(search);
		searchbox.click();

		driver.close();
	}
}
