package Selenium.Day2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com.gr/");
        driver.manage().window().maximize();

//        Xpath with single Attribute
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Amit");

//        Xpath with multiple Attribute

        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Amit");

//        Xpath with 'and' 'or' operators

        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Amit");
        driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Amit");

//        Xpath with inner text ---text()
//
//        driver.findElement(By.xpath("//a[text()='MacBook']")).click();
//        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

//        find element is present or not
        Boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        System.out.println(displayStatus);

//       find the text getText()
        String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
        System.out.println(value);

//        Xpath with Contains()
        driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("MacBook");

//       Xpath with start-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("MacBook");

//        Chained Xpath
        String s = driver.findElement(By.xpath("//div[@class='col-sm-4']/div/h1/a[contains(text(),'Your Store')]")).getText();
        System.out.println(s);

        Boolean DisplayStatus = driver.findElement(By.xpath("//div[@class='col-sm-4']/div/h1/a[contains(text(),'Your Store')]")).isDisplayed();
        System.out.println(DisplayStatus);

        driver.quit();

    }
}
