package Selenium.HandlingFramesIframesandNestedIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;

public class HandlingFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame 1");
        driver.switchTo().defaultContent(); // go back to the page

        //Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame 2");
        driver.switchTo().defaultContent();// go back to the page

        //Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame 3");

//        Method 1
//        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
//        driver.switchTo().frame(iframe1);
//        driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
//        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='uHMk6b fsHoPb']"));
//        for (WebElement checkbox : checkboxes) {
//            checkbox.click();
//        }


//        Method 2

        driver.switchTo().frame(0); //switching to frame using index
        // click on radio button using normal method
//       driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();

        // click on radio button using js executor
        WebElement rdbutton = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", rdbutton);


        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='uHMk6b fsHoPb']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }


        driver.switchTo().defaultContent();// go back to the page


        //Frame 4
        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Frame 4");
        driver.switchTo().defaultContent();// go back to the page



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
