package Selenium.Topic3_WebDriverMethods.NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        Set<String> windowsIDs = driver.getWindowHandles();

        for (String winid : windowsIDs) {
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

//            if(title.equals("Human Resources Management Software | OrangeHRM HR Software")){
//                driver.close();
//            }
            if (title.equals("Human Resources Management Software | OrangeHRM HR Software") || title.equals("some other title")) {
                driver.close();
            }

        }


    }
}
