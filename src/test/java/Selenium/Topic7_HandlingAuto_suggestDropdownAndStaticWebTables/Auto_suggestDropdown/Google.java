package Selenium.Topic7_HandlingAuto_suggestDropdownAndStaticWebTables.Auto_suggestDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Google {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(5000);
        List<WebElement> search = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        System.out.println(search.size());

        for (int i = 0; i < search.size(); i++) {
            System.out.println(search.get(i).getText());
        }

        for (int i = 0; i < search.size(); i++) {

            if(search.get(i).getText().equals("selenium"))
            {
                search.get(i).click();
                break;
            }
        }
    }
}
