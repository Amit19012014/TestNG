package Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize(); // Maximize the browser window

//        tag id     tag#id
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T_shirts");
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T_shirts");

//        tag class            tag.class_name
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T_shirts");
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T_shirts");

//        tag attribute        tag[attribute = "value"]
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T_shirts");
        driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T_shirts");

//        tag class attribute  tag.class_name[attribute = "value"]
        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Amit");
        driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("Amit");


    }
}
