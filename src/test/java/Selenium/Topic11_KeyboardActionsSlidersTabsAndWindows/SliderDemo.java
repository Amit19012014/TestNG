package Selenium.Topic11_KeyboardActionsSlidersTabsAndWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        WebElement minSlider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
        WebElement maxSlider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[2]"));

        //Minimum slider
        System.out.println("default Location of the minimum slider before moving" + minSlider.getLocation()); //(226, 47)
        System.out.println(minSlider.getLocation().getX()); //226
        System.out.println(minSlider.getLocation().getY()); //47


//        action.dragAndDropBy(minSlider, 100, 47).perform();
        action.dragAndDropBy(minSlider, -226, 47).perform();


        System.out.println("default Location of the minimum slider after moving" + minSlider.getLocation()); //(327, 47)

        // Maximum slider
        System.out.println("default Location of the maximum slider before moving" + maxSlider.getLocation()); //(910, 47)
        System.out.println(maxSlider.getLocation().getX()); //910
        System.out.println(maxSlider.getLocation().getY()); //47


        action.dragAndDropBy(maxSlider, 609, 47).perform();
//        action.dragAndDropBy(maxSlider, -100, 47).perform();
        Thread.sleep(5000);
        System.out.println("default Location of the minimum slider after moving" + maxSlider.getLocation()); //(1010, 47)
//        System.out.println("default Location of the minimum slider after moving" + maxSlider.getLocation()); (810, 47)

    }
}
