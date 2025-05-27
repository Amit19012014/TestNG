package Selenium.Topic3_WebDriverMethods.BrowserMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Thread.sleep(2000);
//        driver.close(); //- close single browser window wherever driver is focused
        driver.quit(); //- close multiple browsers windows



    }


}
