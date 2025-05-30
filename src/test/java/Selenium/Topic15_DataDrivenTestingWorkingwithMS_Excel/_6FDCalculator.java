package Selenium.Topic15_DataDrivenTestingWorkingwithMS_Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.io.IOException;
import java.time.Duration;

public class _6FDCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id=\"wzrk-cancel\"]")).click();

        String filePath = System.getProperty("user.dir") + "\\TestData\\caldata.xlsx";

        int rows = _5ExcelUtils.getRowCount(filePath, "Sheet1"); //_5ExcelUtils class

        for (int i = 1; i <= rows; i++) {


            //  3 steps for every row
            // read data from Excel
            String pricipleAmount = _5ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
            String ROI = _5ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
            String Period1 = _5ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
            String Period2 = _5ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
            String frequency = _5ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
            String ExpectedMaturityValue = _5ExcelUtils.getCellData(filePath, "Sheet1", i, 5);

            //Pass above data into application
            driver.findElement(By.xpath("//input[@name=\"principal\"]")).sendKeys(pricipleAmount);
            driver.findElement(By.xpath("//input[@name=\"interest\"]")).sendKeys(ROI);
            driver.findElement(By.xpath("//input[@name=\"tenure\"]")).sendKeys(Period1);
            Select perdrp = new Select(driver.findElement(By.xpath("//select[@name=\"tenurePeriod\"]")));
            perdrp.selectByVisibleText(Period2);

            Select fredrp = new Select(driver.findElement(By.xpath("//select[@name=\"frequency\"]")));
            fredrp.selectByVisibleText(frequency);

            driver.findElement(By.xpath("(//div[@class=\"CTR PT15\"]//a)[1]")).click();

            String act_matValue = driver.findElement(By.xpath("//span[@id=\"resp_matval\"]//strong")).getText();

            //validation

            if (Double.parseDouble(ExpectedMaturityValue) == Double.parseDouble(act_matValue)) {
                System.out.println("Test Passed");
                _5ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
                _5ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);


            } else {
                System.out.println("Test Failed");
                _5ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
                _5ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("//img[@class=\"PL5\"]")).click();
        } // ending of for loop

        driver.quit();
    }
}
