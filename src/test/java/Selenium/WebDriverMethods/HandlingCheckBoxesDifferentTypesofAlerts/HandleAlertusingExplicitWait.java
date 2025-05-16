package Selenium.WebDriverMethods.HandlingCheckBoxesDifferentTypesofAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Handle Alert without using switchTo().alert();
public class HandleAlertusingExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Thread.sleep(5000);

        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); // capture the alert

        System.out.println(myalert.getText());
        myalert.accept();

    }
}
