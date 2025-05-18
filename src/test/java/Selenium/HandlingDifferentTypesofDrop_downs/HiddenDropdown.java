package Selenium.HandlingDifferentTypesofDrop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        // Clicked on dropdown
        driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[3]")).click();
        // Select single option
//        driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
        // Count the number
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println(options.size());

        for (WebElement op : options) {
            System.out.println(op.getText());
        }

        driver.quit();
    }
}
