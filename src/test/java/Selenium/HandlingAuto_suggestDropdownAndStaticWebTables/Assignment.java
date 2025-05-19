package Selenium.HandlingAuto_suggestDropdownAndStaticWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       WebElement fromport = driver.findElement(By.xpath("//select[@name='fromPort']"));
       Select select = new Select(fromport);
       select.selectByVisibleText("Portland");


       WebElement toport = driver.findElement(By.xpath("//select[@name='toPort']"));
       Select select1 = new Select(toport);
       select1.selectByVisibleText("New York");

       driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

       int rows = driver.findElements(By.xpath("//table[@class=\"table\"]//tbody//tr")).size();


        List<Double> price1 = new ArrayList<Double>();
       
        for (int r = 1; r <= rows; r++) {
           String price = driver.findElement(By.xpath("//table[@class=\"table\"]//tbody//tr["+r+"]//td[6]")).getText();
            String c = price.replace("$","").trim();
            Double price2 = Double.parseDouble(c);
            price1.add(price2);
         }
        for (int r = 0; r < price1.size(); r++) {
            System.out.println(price1.get(r));
        }

        price1.sort();
            
        


    }
}
