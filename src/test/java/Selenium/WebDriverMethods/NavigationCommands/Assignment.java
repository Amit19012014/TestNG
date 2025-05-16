package Selenium.WebDriverMethods.NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {

//        Assignment


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        https://testautomation practice.blogspot.com/
        driver.get(" https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
//        1) provide some string search for it
        driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Amit");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
        String s = driver.findElement(By.id("wikipedia-search-result-link")).getText();


        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
        //        2) count number of links
        System.out.println(links.size());

//        3) click on each link using for loop

        for (WebElement l : links) {
            l.click();
            Thread.sleep(1000);

        }

//        4) get window ID's for every browser window
        Set<String> windowsIDs = driver.getWindowHandles();
        System.out.println(windowsIDs);
//        5) close specific browser window

        for (String winID : windowsIDs) {
            String title = driver.switchTo().window(winID).getTitle();
            if (title.equals("Amit - Wikipedia")) {
                driver.close();

            }
        }


    }
}
