package Selenium.Topic1_IntroductionAndEnvironmentSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumIntroduction{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id=\"ppIS7\"]")).click();
        String title = driver.getTitle();
        System.out.println(title);
    }
}
