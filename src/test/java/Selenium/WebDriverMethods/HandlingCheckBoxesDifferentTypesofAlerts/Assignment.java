package Selenium.WebDriverMethods.HandlingCheckBoxesDifferentTypesofAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mypage.rediff.com/login/dologin");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.switchTo().alert().accept();
    }
}
