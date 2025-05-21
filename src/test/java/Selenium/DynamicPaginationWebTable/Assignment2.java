package Selenium.DynamicPaginationWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.linkText("Admin")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//div[@role='row']"));
        List<WebElement> Columns = driver.findElements(By.xpath("(//div[@role='row'])[1]//div[@role='columnheader']"));


        System.out.println(rows.size());
        System.out.println(Columns.size());


        for (int i = 1; i <= Columns.size(); i++) {
            String s1 = driver.findElement(By.xpath("((//div[@role='row'])[1]//div[@role='columnheader'])[" + i + "]")).getText();
            System.out.println(s1);
        }

        for (int i = 2; i <= rows.size(); i++) {
            for (int j = 1; j <= Columns.size(); j++) {
                String s = driver.findElement(By.xpath("((//div[@role='row'])[" + i + "]//div[@role='cell'])[" + j + "]")).getText();
                System.out.print(s + "\t");
            }
            System.out.println();
        }

        driver.quit();

    }
}

