package TestNG.ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallelTest1 {

    WebDriver driver;


    @Test
    void logoTest() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the login page.");
        System.out.println("Logo is displayed on the login page");
    }

    @Test
    void homePageTitle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Page title does not match.");
        System.out.println(title);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
