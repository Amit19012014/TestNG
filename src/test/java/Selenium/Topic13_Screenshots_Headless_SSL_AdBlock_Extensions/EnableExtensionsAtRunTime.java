package Selenium.Topic13_Screenshots_Headless_SSL_AdBlock_Extensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EnableExtensionsAtRunTime {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        File file = new File("C:\\Users\\amit1\\OneDrive\\Desktop\\Java\\TestNG\\src\\test\\java\\CRX Extensions\\SelectorsHub-Chrome-Web-Store.crx");
        File file2 = new File("C:\\Users\\amit1\\OneDrive\\Desktop\\Java\\TestNG\\src\\test\\java\\CRX Extensions\\uBlock-Origin-Chrome-Web-Store.crx");
        options.addExtensions(file,file2);

        WebDriver driver = new ChromeDriver(options);


        // Open the URL
        driver.get("https://text-compare.com/");

        // Validate title should be "Your Store"
        String act_title = driver.getTitle();

        if (act_title.equals("Your Store")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        Thread.sleep(10000);

        driver.quit();
    }
}
