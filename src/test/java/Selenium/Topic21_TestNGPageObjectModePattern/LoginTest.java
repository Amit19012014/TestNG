package Selenium.Topic21_TestNGPageObjectModePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() {

//        LoginPageWithoutUsingPageFactory lp = new LoginPageWithoutUsingPageFactory(driver);
        LoginPageUsingPageFactory lp = new LoginPageUsingPageFactory(driver);
        lp.setUsername("Admin");
        lp.setPassword("admin123");
        lp.clickSubmit();

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
