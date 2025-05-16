package Selenium.Day2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasicLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com.gr/");
        driver.manage().window().maximize();


        //name
        driver.findElement(By.name("search")).sendKeys("Mac");

        //id
        boolean logoDisplayOrNot = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplayOrNot);

        //LinkText & PartialLinkText
        driver.findElement(By.linkText("Tablets")).click();
        driver.findElement(By.partialLinkText("Table")).click();

//        driver.wait(10000);
        //Class&TagName
        List<WebElement> headerLinks = driver.findElements(By.className("list-inline"));
        System.out.println("total number of header links  : " + headerLinks.size());

        List<WebElement> headerLinks1 = driver.findElements(By.tagName("li"));
        System.out.println("total number of header links li : " + headerLinks1.size());

        List<WebElement> headerLinks2 = driver.findElements(By.tagName("a"));
        System.out.println("total number of header links a : " + headerLinks2.size());

        for (WebElement link : headerLinks2) {
            System.out.println("Link Text: " + link.getText() + " | URL: " + link.getAttribute("href"));
        }

        List<WebElement> img = driver.findElements(By.tagName("img"));
        System.out.println("total number of images " + img.size());

        //closing the driver
        driver.quit();
    }
}
