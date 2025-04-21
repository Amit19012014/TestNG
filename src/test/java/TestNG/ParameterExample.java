
package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParameterExample {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String app) {

        if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        }
        driver.get(app);
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
