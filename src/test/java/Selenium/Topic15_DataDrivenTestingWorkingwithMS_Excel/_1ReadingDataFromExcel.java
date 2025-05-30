package Selenium.Topic15_DataDrivenTestingWorkingwithMS_Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class _1ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {

//        String path = "C:\\Users\\amit1\\OneDrive\\Desktop\\Java\\TestNG\\TestData\\data.xlsx";
//        FileInputStream file = new FileInputStream(path);

        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\data.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
//        XSSFSheet sheet = workbook.getSheetAt(0); // Alternative method

        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(1).getLastCellNum();

        System.out.println("number of rows : " + totalRows);
        System.out.println("number of cells : " + totalCells);

        for (int i = 0; i <= totalRows; i++) {

            XSSFRow currentRow = sheet.getRow(i);

            for (int j = 0; j < totalCells; j++) {
                XSSFCell cell = currentRow.getCell(j);
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        workbook.close();
        file.close();
    }
}
