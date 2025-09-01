package TestPractice;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NewTestOpen {

    // Read Excel column-wise into a Map
    public static Map<String, String> readColumnWiseData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        Map<String, String> dataMap = new HashMap<>();

        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            String key = row.getCell(0).toString();
            String value = row.getCell(1).toString();
            dataMap.put(key, value);
        }
        workbook.close();
        fis.close();
        return dataMap;
    }

    @DataProvider(name = "excelData")
    public Object[][] getData() throws Exception {
        String path = "src/test/resources/TestExcelFile.xlsx";
        Map<String, String> mapData = readColumnWiseData(path, "Sheet1");
        return new Object[][] { { mapData } };
    }

    @Test(dataProvider = "excelData")
    public void testLogin(Map<String, String> data) {
        System.out.println("url: " + data.get("url"));
        System.out.println("username: " + data.get("username"));
        System.out.println("password: " + data.get("password"));

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(data.get("url"));
        driver.findElement(By.id("user_login")).sendKeys(data.get("username"));
        driver.findElement(By.id("user_password")).sendKeys(data.get("password"));
        driver.findElement(By.name("submit")).click();

        
        driver.quit();
    }
}
