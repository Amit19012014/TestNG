package Selenium.Topic15_DataDrivenTestingWorkingwithMS_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Assignment1 {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\Amit Singh\\AquaProjects\\TestNG\\TestData\\data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(1);
        System.out.println(row.getCell(0).getStringCellValue());
    }
}
