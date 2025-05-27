package Selenium.Topic4_HandlingCheckBoxesDifferentTypesofAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        //1 Normal Alert with Ok button
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//       Thread.sleep(5000);
////        driver.switchTo().alert().accept();
//        Alert myalert=driver.switchTo().alert();
//        System.out.println(myalert.getText());
//        myalert.accept();
//
// 2 Confirmation Alert with Ok or cancel button
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept(); // close alert button using ok button
//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().dismiss();// close alert button using cancel button

//         //3   Prompt Alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
//        driver.switchTo().alert().sendKeys("Amit");
//        driver.switchTo().alert().accept();
        Alert myalert = driver.switchTo().alert();
        myalert.sendKeys("Amit");
        myalert.accept();

    }
}
