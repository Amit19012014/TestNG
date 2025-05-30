package Selenium.Topic15_DataDrivenTestingWorkingwithMS_Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class Assignment {
    public static void main(String[] args) throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
        driver.manage().window().maximize();


        String filepath = System.getProperty("user.dir") + "\\TestData\\cal2data.xlsx";

        int rows = _5ExcelUtils.getRowCount(filepath, "Sheet1");

        for (int i = 1; i <= rows; i++) {

            // read data from Excel
            String deposit_amount = _5ExcelUtils.getCellData(filepath,"Sheet1",i,0);
            String period = _5ExcelUtils.getCellData(filepath,"Sheet1",i,1);
            String ROI = _5ExcelUtils.getCellData(filepath,"Sheet1",i,2);
            String Compounding = _5ExcelUtils.getCellData(filepath,"Sheet1",i,3);
            String ExpectedData = _5ExcelUtils.getCellData(filepath,"Sheet1",i,4);


            //Pass above data into application
            driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).clear();
            driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys(deposit_amount);
            driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).clear();
            driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys(period);
            driver.findElement(By.xpath("//input[@id=\"mat-input-2\"]")).clear();
            driver.findElement(By.xpath("//input[@id=\"mat-input-2\"]")).sendKeys(ROI);
//            Select compdrp = new Select(driver.findElement(By.xpath("//mat-select[@role=\"combobox\"]")));
//            compdrp.selectByVisibleText(Compounding);
            // Click on the mat-select to open dropdown
            WebElement matSelect = driver.findElement(By.xpath("//div[@class=\"mat-select-arrow-wrapper ng-tns-c109-4\"]"));
            matSelect.click();

// Wait for the options to be visible (you may need to use explicit wait)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option[@role=\"option\"]")));

// Select an option
            WebElement option = driver.findElement(By.xpath("//mat-option//span[contains(text(),'"+Compounding+"')]"));
            option.click();





            driver.findElement(By.xpath("(//div[@class=\"mdc-button__ripple\"])[8]")).click();

            String actData = driver.findElement(By.xpath("//span[@id=\"displayTotalValue\"]")).getText();
            String ActualData = actData.replace("$","");
            //validation

            if (Double.parseDouble(ExpectedData)==Double.parseDouble(ActualData)){
                System.out.println("Test Passed");
                _5ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Passed");
                _5ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 6);

            }else {
                System.out.println("Test Failed");
                _5ExcelUtils.setCellData(filepath, "Sheet1", i, 6, "Failed");
                _5ExcelUtils.fillRedColor(filepath, "Sheet1", i, 6);

            }












        }
    }
}
