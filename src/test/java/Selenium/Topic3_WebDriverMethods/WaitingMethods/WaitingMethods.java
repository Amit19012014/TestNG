package Selenium.Topic3_WebDriverMethods.WaitingMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitingMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys("Admin");

    }
}
