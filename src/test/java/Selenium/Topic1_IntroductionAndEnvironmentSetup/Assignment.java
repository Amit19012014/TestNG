package Selenium.Topic1_IntroductionAndEnvironmentSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        if (title.equals("nopCommerce demo store. Home page title")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
