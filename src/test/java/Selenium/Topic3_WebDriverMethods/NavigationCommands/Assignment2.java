

package Selenium.Topic3_WebDriverMethods.NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        // 1) Launch browser and go to the website
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        // 2) Search for a term
        driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Amit");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();

        // Give time for results to load
        Thread.sleep(2000);

        // 3) Get all search result links
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

        // 4) Count number of links
        System.out.println("Number of search result links: " + links.size());

        // 5) Click each link - open in new tab or window
        for (WebElement link : links) {
            link.click();
            Thread.sleep(1000); // Small wait to let new window/tab open
        }

        // 6) Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Number of browser windows opened: " + windowHandles.size());

        // 7) Close a specific window (e.g., window with title containing "Amit")
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            System.out.println("Window Title: " + title);

            if (title.contains("Amit")) {
                System.out.println("Closing window with title: " + title);
                driver.close();
                break;
            }
        }

        // Switch back to the original window
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            break;
        }

        // Optionally quit the entire session
        // driver.quit();
    }
}
