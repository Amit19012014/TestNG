package Selenium.Topic19_TestNGDataProvidersAndParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();


        boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if (status == true) {
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }

    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "dp", indices = {0,1,2,3})
    Object[][] loginData() {

        Object data[][] = {
                {"abc@gmail.com", "test123"},
                {"Amit19012014@gmail.com", "Amit@123"},
                {"xyz@gmail.com", "test012"},
                {"john@gmail.com", "test@123"},
                {"pavanol123@gmail.com", "test@123"},
                {"johncanedy@gmail.com", "test"}

        };
        return data;
    }

}
