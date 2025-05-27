package Selenium.Topic10_MouseHoverAndActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com.gr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Desktops = driver.findElement(By.xpath("(//li//a[contains(text(),'Desktops')])[1]"));
        WebElement Mac = driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));


        Actions actions = new Actions(driver);
//        actions.moveToElement(Desktops).moveToElement(Mac).click().build().perform();
        actions.moveToElement(Desktops).moveToElement(Mac).click().perform();

        Thread.sleep(5000);


        driver.quit();
    }
}
