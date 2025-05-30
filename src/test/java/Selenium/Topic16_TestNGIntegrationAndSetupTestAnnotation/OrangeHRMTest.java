package Selenium.Topic16_TestNGIntegrationAndSetupTestAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;
/*
1) Open the application
2) Test Logo presence
3) Login
4) close
 */


public class OrangeHRMTest {
    WebDriver driver;

    @Test(priority = 1)
    public void OpenApp() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void Logo() {
        WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img"));
        System.out.println(logo.isDisplayed());
    }

    @Test(priority = 3)
    public void LogiN() {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 4)
    public void Logout() {
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        driver.findElement(By.xpath("(//a[@role='menuitem'])[1]")).click();
        driver.quit();
    }
}















