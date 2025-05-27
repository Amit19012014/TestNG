package Selenium.Topic12_JavascriptExecutor_ScrollingPages_UploadFiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZoomZoomOut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
//        driver.manage().window().minimize();
//        driver.manage().window().maximize();
//        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='50%'"); //set zoom level 50 %
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='80%'"); //set zoom level 80 %
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='50%'"); //set zoom level 50 %
        Thread.sleep(5000);


    }
}
