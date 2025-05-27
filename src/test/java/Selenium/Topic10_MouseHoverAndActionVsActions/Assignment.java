package Selenium.Topic10_MouseHoverAndActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        Actions act = new Actions(driver);

        WebElement doubleClickElement = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));

        act.doubleClick(doubleClickElement).build().perform();



        // Source element
        WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
        //Target element
        WebElement target = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));

        act.dragAndDrop(source,target).build().perform();


    }

}
