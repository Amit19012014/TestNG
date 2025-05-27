package Selenium.Topic6_HandlingDifferentTypesofDrop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment {
    //    Assignment
// 1) Handle country dropdown with/without using Select class:
//    https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
//    a) count total number of options
//    b) print all the options
//    c) select one option
//
// 2) Hidden dropdown
//    Login to OrangeHRM--> pim--> employee status
//
// 3) https://testautomationpractice.blogspot.com/
//    colors mult select box
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");


        WebElement drpCountryEle = driver.findElement(By.id("country-list"));
        Select drpCountry = new Select(drpCountryEle);

        //select option from the dropdown
        drpCountry.selectByVisibleText("China");
        Thread.sleep(2000);
        drpCountry.selectByValue("1");
        Thread.sleep(2000);
        drpCountry.selectByIndex(4);

        List<WebElement> Options = drpCountry.getOptions();
        System.out.println("No. of options in the dropdown : " + Options.size());

        // printing the options using enhanced for loop
        for (WebElement op : Options) {
            System.out.println(op.getText());
        }
        System.out.println("==============================");
        // printing the options using  normal for loop
        for (int i = 0; i<Options.size(); i++){
            System.out.println(Options.get(i).getText());
        }


        // 2) Hidden dropdown
//    Login to OrangeHRM--> pim--> employee status

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

        driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]")).click();
        driver.findElement(By.xpath("//*[@class=\"oxd-select-option\"]//span[contains(text(),'Freelance')]")).click();



        driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]")).click();

        List<WebElement>  options = driver.findElements(By.xpath("//*[@class=\"oxd-select-option\"]/span"));
        System.out.println(options.size());

        for(WebElement op : options){
            System.out.println(op.getText());
        }
//         3) https://testautomationpractice.blogspot.com/
//    colors mult select box

        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement color = driver.findElement(By.xpath("//select[@id='colors']"));
        Select color1 = new Select(color);

        color1.selectByVisibleText("Red");
        color1.selectByValue("blue");
        color1.selectByValue("green");

        List<WebElement> Colors = color1.getOptions();
        System.out.println(Colors.size());

        for (WebElement c : Colors) {
            System.out.println(c.getText());
        }
    }

}
