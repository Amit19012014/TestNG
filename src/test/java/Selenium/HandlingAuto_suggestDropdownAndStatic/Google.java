package Selenium.HandlingAuto_suggestDropdownAndStatic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        List<WebElement> search = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]//span"));
        for (WebElement s : search){
            System.out.println(s.getText());
        }

    }
}
