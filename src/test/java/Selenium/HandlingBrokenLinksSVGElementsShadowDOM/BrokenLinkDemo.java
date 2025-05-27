package Selenium.HandlingBrokenLinksSVGElementsShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

//1) Link href="https://xyz.com" --> should have  href attribute
//2) https://xyz.com -- hit the url to the server --->then we will get the status code
//https://xyz.com ---->Server----> status code
//3) status code >=400 broken link
//status code <400 not a broken link


public class BrokenLinkDemo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //Capture all the links from the website
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("total number of links = " + Links.size());

        int noOfBrokenLinks = 0;

        for (WebElement linkElement : Links) {
            String hrefattvalue = linkElement.getAttribute("href");

            if (hrefattvalue == null || hrefattvalue.isEmpty()) {
                System.out.println("href attribute value is null or empty. so Not possible to check");
                continue;
            }

            // hit url to the server
            try {
                URL linkURL = new URL(hrefattvalue); // converted href value from string to URL format
                HttpURLConnection connectionLinkURL = (HttpURLConnection) linkURL.openConnection(); // Open connection to the server
                connectionLinkURL.connect(); // connect to server and sent request to the server

                if (connectionLinkURL.getResponseCode() >= 400) {
                    System.out.println(hrefattvalue + " =====>Broken Link");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefattvalue + "======>Not a broken Link");
                }
            } catch (Exception e) {

            }

        }
        System.out.println("Number of BrokenLinks = " + noOfBrokenLinks);

        driver.quit();
    }
}
