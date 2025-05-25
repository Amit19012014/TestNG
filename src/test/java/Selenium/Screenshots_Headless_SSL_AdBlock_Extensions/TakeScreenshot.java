package Selenium.Screenshots_Headless_SSL_AdBlock_Extensions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenshot {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


//        Full Page Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//        File targetFile = new File(System.getProperty("user.dir")+"\\ScreenShot\\fullpage.png");
        File targetFile = new File("C:\\Users\\amit1\\OneDrive\\Desktop\\Java\\TestNG\\src\\test\\java\\Selenium\\Screenshots_Headless_SSL_AdBlock_Extensions\\ScreenShot\\fullpage.png");

        sourceFile.renameTo(targetFile); //Copy sourceFile to Targetfile


        //capture the screenshot from specific area of page
        WebElement featureProduct = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));

        File sourceFile1 = featureProduct.getScreenshotAs(OutputType.FILE);
        File targetFile1 = new File("C:\\Users\\amit1\\OneDrive\\Desktop\\Java\\TestNG\\src\\test\\java\\Selenium\\Screenshots_Headless_SSL_AdBlock_Extensions\\ScreenShot\\featureProduct.png");
        sourceFile1.renameTo(targetFile1); //Copy sourcefile to Targetfile

        //3) capture the screenshot of a webElement
        WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']//a//img"));
        File sourceFile2 = logo.getScreenshotAs(OutputType.FILE);
        File targetFile2 = new File("C:\\Users\\amit1\\OneDrive\\Desktop\\Java\\TestNG\\src\\test\\java\\Selenium\\Screenshots_Headless_SSL_AdBlock_Extensions\\ScreenShot\\logo.png");
        sourceFile2.renameTo(targetFile2); //Copy sourcefile to Targetfile


    }
}
