package Selenium.Topic6_HandlingDifferentTypesofDrop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        // Select single option
        driver.findElement(By.xpath("//button[@data-toggle=\"dropdown\"]")).click();
//        driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();
//        // Select multiple option
//        driver.findElement(By.xpath("//input[@value=\"csharp\"]")).click();
//        driver.findElement(By.xpath("//input[@value=\"MySQL\"]")).click();

        // Capture all the option in the dropdown and number of options in dropdown
        List<WebElement> options = driver.findElements(By.xpath("//a[@tabindex=\"0\"]"));
        System.out.println("No. of Option in the dropdowns : " + options.size());

        for (WebElement op : options) {
            String option = op.getText();
            if (option.equals("Java") || option.equals("Python") || option.equals("MySQL")) {
                op.click();
            }
        }

        Thread.sleep(2000);


        driver.quit();
    }
}
