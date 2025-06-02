package Selenium.Topic21_TestNGPageObjectModePattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithoutUsingPageFactory {

    WebDriver driver;
    //constructor

    LoginPageWithoutUsingPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    //Locators

    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By submit_button = By.xpath("//button[@type='submit']");

    //Action Methods


    public void setUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void setPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickSubmit() {
        driver.findElement(submit_button).click();
    }
}
