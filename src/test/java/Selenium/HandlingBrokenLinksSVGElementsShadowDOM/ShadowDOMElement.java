package Selenium.HandlingBrokenLinksSVGElementsShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShadowDOMElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.findElement(By.cssSelector("#input")).sendKeys("Welcome"); // NoSuchElementException

//        Handle shadow DOM.

        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");


    }
}
