package Selenium.HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement datepicker = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(datepicker);

//        By using sendkeys
//        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/25/2000"); // MM/DD/YYYY

//        Method 2 : Using Date Picker
        //Expected Data
        String year = "2026";
        String month = "January";
        String date = "20";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // Open the date picker
//        driver.findElement(By.xpath("")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

//        WebElement prev = driver.findElement(By.xpath("//a[@data-handler='prev']"));
////a[@data-handler='prev']
//        while (true){
//            String current_month = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-month']")).getText();
//            String currentyear = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-year']")).getText();
//
//            if(current_month.equals(month) && currentyear.equals(year)){
//                break;
//            }
//                prev.click();
//
//
//        }






        driver.quit();

    }

}
