package ExcelPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MutipileUserStore2 {
	@DataProvider(name="userdetails")
	public static Object[][] userdetails() throws IOException{
        FileInputStream file = new FileInputStream("C:\\Users\\ramu3\\Downloads\\Book1.xlsx");
        Workbook book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheetAt(0);

        int rown = sheet.getLastRowNum();

        // Start from 1 to skip the header row
        Object[][] data = new Object[5][3];
        for (int i = 1; i <= rown; i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            data[i-1][0] = row.getCell(0).getStringCellValue();
            data[i-1][1] = row.getCell(1).getStringCellValue();
            data[i-1][2] = row.getCell(2).toString();

        }

        book.close();
        file.close();
        return data;
    }
	@Test(dataProvider ="userdetails")
	  public void f(String username,String password,String number) {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://accounts.lambdatest.com/login?_gl=1*1n8k5z5*_gcl_au*MjA5NTcyODQzNi4xNzQ0MzU4NDAw");
		  //driver.manage().window().maximize();
		  driver.findElement(By.id("email")).sendKeys(username);
		  driver.findElement(By.id("password")).sendKeys(password);
		  WebElement ele = driver.findElement((By.id("login-button")));
		  ele.click();
		  System.out.println(username+" "+password+" "+number);
		  driver.close();
	  }
}
