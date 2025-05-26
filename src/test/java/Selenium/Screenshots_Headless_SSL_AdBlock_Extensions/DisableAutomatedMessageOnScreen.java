package Selenium.Screenshots_Headless_SSL_AdBlock_Extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageOnScreen {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

        WebDriver driver = new ChromeDriver(options);


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
