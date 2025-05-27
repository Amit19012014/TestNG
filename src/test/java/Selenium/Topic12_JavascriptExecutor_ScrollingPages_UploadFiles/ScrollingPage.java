package Selenium.Topic12_JavascriptExecutor_ScrollingPages_UploadFiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
       //1 Scroll down the page by pixel number.
//        js.executeScript("window.scrollBy(0,1500)","");
//        System.out.println(js.executeScript("return window.pageYOffset;"));
//         Thread.sleep(2000);

         //2 Scroll the page till element is visible
//        WebElement element = driver.findElement(By.xpath("//strong[contains(text(),'Community poll')]"));
//
//        js.executeScript("arguments[0].scrollIntoView();",element);
//        System.out.println(js.executeScript("return window.pageYOffset;"));
//        Thread.sleep(2000);

        //3 Scroll page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(2000);

        //Scrolling up to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(2000);




    }
}
