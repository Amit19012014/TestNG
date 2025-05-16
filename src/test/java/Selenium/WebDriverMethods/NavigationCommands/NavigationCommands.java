package Selenium.WebDriverMethods.NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationCommands {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/"); // Accepts URL only in the String format


//    URL myURL = new URL("https://demo.nopcommerce.com/");
//    driver.navigate().to(myURL);

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();




    }
}
