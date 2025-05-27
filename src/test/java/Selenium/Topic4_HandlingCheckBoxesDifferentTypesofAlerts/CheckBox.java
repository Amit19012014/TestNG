package Selenium.Topic4_HandlingCheckBoxesDifferentTypesofAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();


        //Select specific checkbox
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //Select all the checkboxes
        List<WebElement> box = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//        for (int i=0;i< box.size();i++){
//            box.get(i).click();
//        }

//        for (WebElement B : box ){
//            B.click();
//        }

//      //2  Select last 3 checkboxes
        //total number of checkboxes - how many checkboxes want to select = starting index
        //7-3=4(Starting index )
//
//        //3 select last 3 checkboxes
//        for (int i =4;i<box.size();i++){
//            box.get(i).click();
//        }

        //4 select first 3 checkboxes
//        for (int j = 0; j < 3; j++) {
//            box.get(j).click();
//        }

        //5 unselect checkboxes if they are selected
        for (int j = 0; j < 3; j++) {
            box.get(j).click();
        }
        Thread.sleep(3000);
        for (int j = 0; j< box.size() ; j++) {
            if (box.get(j).isSelected()){
                box.get(j).click();
            }

        }

    }
}
