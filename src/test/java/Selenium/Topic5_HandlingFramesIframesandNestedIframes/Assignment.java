package Selenium.Topic5_HandlingFramesIframesandNestedIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

//        Assignment
//        https://ui.vision/demo/webtest/frames/
//        1) switch to 5th frame
//        2) click on link - opens new iframe
//        3) switch to inner frame
//        4) check logo presence in in the inner frame.

        //Frame 5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Frame 5");
        driver.findElement(By.xpath("//a[contains(text(),'https://a9t9.com')]")).click();
        WebElement logo = driver.findElement(By.xpath("//a[@id='logo']"));
        System.out.println(logo.isDisplayed());
        logo.click();
        driver.switchTo().defaultContent();// go back to the page
    }
}
