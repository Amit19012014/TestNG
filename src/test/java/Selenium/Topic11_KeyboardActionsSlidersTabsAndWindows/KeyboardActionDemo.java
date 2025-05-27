package Selenium.Topic11_KeyboardActionsSlidersTabsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActionDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement inputbox = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        inputbox.sendKeys("WELCOME");

        Actions actions = new Actions(driver);

        //ctrl+A - select the text
        actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //ctrl+C - copy the text
        actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab - shift to next textarea
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //ctrl+V  - paste the text
        actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();


    }
}
