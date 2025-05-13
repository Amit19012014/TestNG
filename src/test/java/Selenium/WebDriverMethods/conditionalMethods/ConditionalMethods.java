package Selenium.WebDriverMethods.conditionalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        // conditional methods

//        isDisplayed()

        WebElement DisplayStatus = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(" displayed status of logo : " + DisplayStatus.isDisplayed());

        Boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(" displayed status of logo : " + logo);


//        isEnable()
        Boolean enableStatus = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println(enableStatus);

        WebElement enableStatus1 = driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println(enableStatus1); //[[ChromeDriver: chrome on windows (86d6a293a937f80e31e2323236cc4a9d)] -> xpath: //input[@id='FirstName']]
        System.out.println(enableStatus1.isEnabled());


//         isSelected()

        WebElement selectStatus1 = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement selectStatus2 = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(selectStatus1.isSelected());
        System.out.println(selectStatus2.isSelected());

        System.out.println("After selecting male radio button");
        selectStatus1.click();
        System.out.println(selectStatus1.isSelected());
        System.out.println(selectStatus2.isSelected());

        System.out.println("After selecting female radio button");
        selectStatus2.click();
        System.out.println(selectStatus1.isSelected());
        System.out.println(selectStatus2.isSelected());


        WebElement NewsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        System.out.println("NewsLetter : " + NewsLetter.isSelected());

        driver.quit();
    }
}
