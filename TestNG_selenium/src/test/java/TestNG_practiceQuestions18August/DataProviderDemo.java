package TestNG_practiceQuestions18August;




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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//5.Use Data Provider to supply multiple sets of usernames/passwords to a login test.

public class DataProviderDemo {

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
    @Test(dataProvider="excelData")
    public void testLogin(String username,String password) {
    	System.out.println("username :"+username+" | password :"+password);
    	 WebDriver driver=new ChromeDriver();
    	
    	 driver.get("http://zero.webappsecurity.com/login.html");
    	 driver.manage().window().maximize();
    	 
    	 driver.findElement(By.id("user_login")).click();
    	 driver.findElement(By.id("user_login")).sendKeys(username);
    	 driver.findElement(By.id("user_password")).click();
    	 driver.findElement(By.id("user_password")).sendKeys(password);
    	 driver.findElement(By.name("submit")).click();
    	 driver.close();
    }
}
