package Selenium.WebDriverMethods.HandlingCheckBoxesDifferentTypesofAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticatedpopup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/basic_auth");
        //contains username and password.
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
