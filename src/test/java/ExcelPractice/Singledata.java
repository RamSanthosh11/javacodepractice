package ExcelPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import org.testng.annotations.Test;

public class Singledata {
  @Test
  public void f() throws IOException{
	  FileInputStream file = new FileInputStream("C:\\Users\\ramu3\\Downloads\\Book1.xlsx");
	  
	  Workbook workbook = new XSSFWorkbook(file);
	  
	  Sheet sheet = workbook.getSheetAt(0);
	  
	  Row row = sheet.getRow(1);
	  
	  String username = row.getCell(0).getStringCellValue();
	  String password = row.getCell(1).getStringCellValue();
	  //double key = row.getCell(2).getNumericCellValue();
	  int keyInt = (int) row.getCell(2).getNumericCellValue();
	  System.out.println(username+" "+password);
	  System.out.println(key);
	  
	  
	  
  }
}
