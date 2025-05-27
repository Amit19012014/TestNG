package Selenium.Topic1_IntroductionAndEnvironmentSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

//        Assignment
//        Open application "https://www.demoblaze.com/index.html"
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(10000);
        driver.manage().window().maximize();


//        1) Total number of links & print them
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links : " + links.size());
        for (WebElement link : links) {
            System.out.println("links = " + link.getText() + "| URL " + link.getAttribute("href"));
        }


//        2) Total number of images
        List<WebElement> links2 = driver.findElements(By.tagName("img"));
        System.out.println("Number of images : " + links2.size());

//        3) Click on Any product link using linkText /partialLinkText
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        driver.findElement(By.partialLinkText("ptops")).click();
        Thread.sleep(5000);


    }
}
