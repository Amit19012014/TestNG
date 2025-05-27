package Selenium.Topic15_DataDrivenTestingWorkingwithMS_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

//Excel File ----> WorkBook ------>Sheets------->Rows---->Cells
public class WritingDataInSpecificRowAndCell {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myFileRandom.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");


        XSSFRow row3 = sheet.createRow(3);
        XSSFCell cell = row3.createCell(4);
        cell.setCellValue("Welcome");

        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("file is created");

    }
}
