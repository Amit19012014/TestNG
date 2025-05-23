package Selenium.MouseHoverAndActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Switch to frame
        driver.switchTo().frame("iframeResult");


        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));

        box1.clear(); // clear the box
        box1.sendKeys("Welcome");


        Actions action = new Actions(driver);
        // double click
        action.doubleClick(button).build().perform();

        //validation : box2 should contain "Welcome"
        String text = box2.getAttribute("value");

        if (text.equals("Welcome")) {
            System.out.println("Text Copied");
        } else {
            System.out.println("Text not Copied");
        }
    }
}
