package ExcelPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MutipileUserStore {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\ramu3\\Downloads\\Book1.xlsx");
        Workbook book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheetAt(0);

        int rown = sheet.getLastRowNum();

        // Start from 1 to skip the header row
        for (int i = 1; i <= rown; i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();   

            // Convert cell value to string, then to int
            String keyString = row.getCell(2).toString();
            int keyInt = (int) Double.parseDouble(keyString);
            System.out.println(username + " " + password + " " + keyInt);
        }

        book.close();
        file.close();
    }
}
