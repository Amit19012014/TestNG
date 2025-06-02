package Selenium.Topic21_TestNGPageObjectModePattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.bidi.browsingcontext.Locator.xpath;

public class LoginPageUsingPageFactory {

    WebDriver driver;
    //constructor

    LoginPageUsingPageFactory(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locators

//    By username = By.xpath("//input[@name='username']");
//    By password = By.xpath("//input[@name='password']");
//    By submit_button = By.xpath("//button[@type='submit']");

//    @FindBy(xpath = "//input[@name='username']")
    @FindBy(how = How.XPATH,using = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit_button;

    @FindBy(tagName = "a")
    List<WebElement> links;


    //Action Methods

    public void setUsername(String user) {
        username.sendKeys(user);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickSubmit() {
        submit_button.click();
    }
}
