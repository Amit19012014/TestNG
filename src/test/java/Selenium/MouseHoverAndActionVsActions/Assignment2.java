package Selenium.MouseHoverAndActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        // Debit Side

        //amount source
        WebElement amount_source = driver.findElement(By.xpath("(//li[@data-id=\"2\"])[1]"));
        //Bank Source
        WebElement Bank_Source = driver.findElement(By.xpath("//li[@data-id=\"5\"]"));
        // Bank Target
        WebElement Bank_target = driver.findElement(By.xpath("//ol[@id='bank']"));
        //amount_target
        WebElement amount_target = driver.findElement(By.xpath("//ol[@id='amt7']"));

        act.dragAndDrop(amount_source, amount_target).build().perform();
        act.dragAndDrop(Bank_Source, Bank_target).build().perform();


        // Credit Side

        //sales source
        WebElement sales_source = driver.findElement(By.xpath("//li[@data-id=\"6\"]"));
        //sales target
        WebElement sales_target = driver.findElement(By.xpath("//ol[@id=\"loan\"]"));
        //amount source
        WebElement amount_source1 = driver.findElement(By.xpath("(//li[@data-id=\"2\"])[2]"));
        //amount target
        WebElement amount_target1 = driver.findElement(By.xpath("//ol[@id='amt8']"));


        act.dragAndDrop(sales_source,sales_target).build().perform();
        act.dragAndDrop(amount_source1,amount_target1).build().perform();





    }
}
