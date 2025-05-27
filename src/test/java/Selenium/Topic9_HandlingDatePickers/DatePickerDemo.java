package Selenium.Topic9_HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {

    static void selectFutureDate(WebDriver driver, String month, String year, String date) {
        while (true) {
            String current_month = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-month']")).getText();
            String current_year = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-year']")).getText();

            if (current_month.equals(month) && current_year.equals(year)) {
                break;
            }
            driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); // click on next button

        }
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
        for (WebElement date1 : alldates) {
            if (date1.getText().equals(date)) {
                date1.click();
                break;
            }
        }
    }

    static void selectPastDate(WebDriver driver, String month, String year, String date) {
        while (true) {
            String current_month = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-month']")).getText();
            String current_year = driver.findElement(By.xpath("//div//span[@class='ui-datepicker-year']")).getText();

            if (current_month.equals(month) && current_year.equals(year)) {
                break;
            }

            driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click(); // click on prev button
        }
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
        for (WebElement date1 : alldates) {
            if (date1.getText().equals(date)) {
                date1.click();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement datepicker = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(datepicker);

//        Method 2 : Using Date Picker
        //Expected Data
        String year = "2026";
        String month = "April";
        String date = "25";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // Open the date picker
        selectFutureDate(driver, month, year, date);
//        selectPastDate(driver, month, year, date);

        Thread.sleep(5000);
        driver.quit();

    }

}
//        By using sendkeys
//        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/25/2000"); // MM/DD/YYYY


//select the date
//        Method 1
//        driver.findElement(By.xpath("//a[contains(text(),'" + date + "')]")).click();
//        Method 2
