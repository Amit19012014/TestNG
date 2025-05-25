package Selenium.JavascriptExecutor_ScrollingPages_UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));

//      JavascriptExecutor js = driver;
//      passing the test into inputbox - alternte of sendKeys()
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','John')", inputbox);

//      clicking on element - alternate of click()
        WebElement radiobtn = driver.findElement(By.xpath("//input[@id=\"male\"]"));
        js.executeScript("arguments[0].click()", radiobtn);


    }
}
