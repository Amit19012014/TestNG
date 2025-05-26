package Selenium.Screenshots_Headless_SSL_AdBlock_Extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessTesting {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // setting for headless mode of execution


        WebDriver driver = new ChromeDriver(options);
//        WebDriver driver = new EdgeDriver();
//        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.get("https://demo.opencart.com.gr");

        // Validate title should be "Your Store"
        String act_title = driver.getTitle();

        if (act_title.equals("Your Store")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();


    }
}
