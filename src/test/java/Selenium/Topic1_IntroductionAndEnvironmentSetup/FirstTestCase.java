package Selenium.Topic1_IntroductionAndEnvironmentSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch the browser
// Open URL https://demo.opencart.com/
// Validate title should be "Your Store"
// Close Browser


public class FirstTestCase {
    public static void main(String[] args) throws InterruptedException {

//        1) Launch the browser
        WebDriver driver = new ChromeDriver();
        //        2) Open the URL
        driver.get("https://www.opencart.com/");
//        driver.get("https://demo.opencart.com/");

//        3) Validate the title should be "Your Store"
        String act_title = driver.getTitle();
        if (act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

//        4) Close Browser
//        driver.close();
        driver.quit();
    }
}
