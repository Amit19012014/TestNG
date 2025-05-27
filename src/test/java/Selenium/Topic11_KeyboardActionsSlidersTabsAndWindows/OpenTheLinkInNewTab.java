package Selenium.Topic11_KeyboardActionsSlidersTabsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OpenTheLinkInNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Actions act = new Actions(driver);

        // Control+Registation Link
        act.keyDown(Keys.CONTROL).click(Register).keyUp(Keys.CONTROL).perform();

        //Switching to registrtion page
        List<String> id = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(id.get(1)); // switch to registration page

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Amit");

        driver.switchTo().window(id.get(0)); // Switch to home page

        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Tshirt");

    }
}
