package Selenium.DynamicPaginationWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Table {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com.gr/admin/index.php?");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("(//li[@id=\"menu-customer\"]//a)[1]")).click();
        driver.findElement(By.xpath("(//ul[@id=\"collapse33\"]//li)[1]")).click();

        String s = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
        System.out.println(s);


        int Pages = Integer.parseInt(s.substring(s.indexOf("(") + 1, s.indexOf("Pages") - 1));
        System.out.println(Pages);
        for (int p = 1; p <= Pages; p++) {

            // Click on page number (except first, which is already open)
            if (p > 1) {
                WebElement pageLink = driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='" + p + "']"));
                pageLink.click();
                Thread.sleep(1000);
            }

            // Get current rows and columns after page load
            List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr"));
            List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//thead//td"));

            //Read the data from the tables

            for (int i = 1; i <= rows.size(); i++) {
                for (int j = 1; j <= columns.size(); j++) {
                    String cellValue = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + i + "]//td[" + j + "]")).getText();
                    System.out.print(cellValue + "\t");
                }
                System.out.println(); // Move to next line after each row
            }


        }
    }
}
