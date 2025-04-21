package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParameterExample {

    WebDriver driver;

    @BeforeClass
    void setup(){
        // Initialize the WebDriver (Edge browser)
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void logoTest() {
        // Using WebDriverWait to wait for the logo's visibility
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='orangehrm-logo']")));

        // Assert that the logo is displayed
        Assert.assertTrue(logo.isDisplayed(), "The logo should be displayed on the page.");
    }

    @Test(priority = 2)
    void homePageTitle(){
        // Assert that the page title is "OrangeHRM"
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "The title of the page is incorrect.");
    }

    @AfterClass
    void tearDown(){
        // Close the browser after tests are done
        driver.quit();
    }
}
