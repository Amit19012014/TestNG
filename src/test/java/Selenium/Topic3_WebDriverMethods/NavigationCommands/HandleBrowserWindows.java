package Selenium.Topic3_WebDriverMethods.NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        Set<String> windowsIDs = driver.getWindowHandles();
        System.out.println(windowsIDs);

//        // Approach 1
//        List<String> windowList = new ArrayList<>(windowsIDs);
//        String ParentID = windowList.get(0);
//        String childID = windowList.get(1);
//
//        System.out.println(driver.getTitle());
//
//        // Switch to child window
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());
//
//        // Switch to Parent window
//        driver.switchTo().window(ParentID);
//        System.out.println(driver.getTitle());

        // Approach 2

        for(String winID : windowsIDs){
            String title = driver.switchTo().window(winID).getTitle();
            if(title.equals("OrangeHRM")){
                System.out.println(driver.getCurrentUrl());
                // some validation on the parent window
            }
        }


    }
}
