package Selenium.Topic10_MouseHoverAndActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionVsActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement rightClick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

        Actions actions = new Actions(driver);

        //Right Click Action
        Action myAction = actions.contextClick(rightClick).build(); // building/creating an action and storing into a variable
        myAction.perform(); // we are performing the action


        Thread.sleep(5000);
        //click on copy
        driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();

        //close the alert box
        driver.switchTo().alert().accept();

    }
}
