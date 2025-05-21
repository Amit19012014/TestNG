package Selenium.DynamicPaginationWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        System.out.println(rows.size());
//        System.out.println(columns.size());


        List<WebElement> PageLink = driver.findElements(By.xpath("//ul[@class=\"pagination\"]//li//a"));
        for (int i = 1; i <= PageLink.size(); i++) {
            driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li[" + i + "]")).click();
            Thread.sleep(1000);

            List<WebElement> rows = driver.findElements(By.xpath("//table[@id = \"productTable\"]//tbody//tr"));
            List<WebElement> columns = driver.findElements(By.xpath("//table[@id = \"productTable\"]//tbody//tr[1]//td"));

            // Fetching the data from the tables
            for (int a = 1; a <= rows.size(); a++) {
                for (int j = 1; j <= columns.size() - 1; j++) {
                    String cellvalue = driver.findElement(By.xpath("//table[@id = 'productTable']//tbody//tr[" + a + "]//td[" + j + "]")).getText();
                    System.out.print(cellvalue + "\t");
                    driver.findElement(By.xpath("//table[@id = 'productTable']//tbody//tr[" + a + "]//td[4]//input[@type='checkbox']")).click();
                }
                System.out.println();
            }
        }

    }
}
