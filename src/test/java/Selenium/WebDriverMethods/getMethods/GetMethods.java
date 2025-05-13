package Selenium.WebDriverMethods.getMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

//        get(url) opens the url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();


//        getTitle() returns title of the page
        String title = driver.getTitle();
        System.out.println("Title : " + title);

//        getCurrentUrl() returns URL of the page
        String URL = driver.getCurrentUrl();
        System.out.println("URL : " + URL);

//        getPageSource() returns source code of the page
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

//        getWindowHandle() returns ID of the single Browser window
        String wh = driver.getWindowHandle();
        System.out.println("Window ID"+wh);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Thread.sleep(5000);

        Set<String> WindowIDs = driver.getWindowHandles();
        System.out.println(WindowIDs); //[7B8ED731456A949BDA6E6AAAFFD5B12E, CA39C33FAD3D3E13DAE77AE20A8E3CB0]

        driver.quit();

    }
}
