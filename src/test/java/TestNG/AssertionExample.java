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

public class AssertionExample {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    void setup() {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    void logoTest() {
        // Wait until the logo is visible
        WebElement logo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"orangehrm-login-logo\"]"))
        );
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the login page.");
        System.out.println("Logo is displayed on the login page");
    }

    @Test(priority = 1)
    void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Page title does not match.");

    }

    @AfterClass
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
