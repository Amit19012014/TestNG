package Selenium.Topic6_HandlingDifferentTypesofDrop_downs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement drpCountryEle = driver.findElement(By.id("country"));
        Select drpCountry = new Select(drpCountryEle);

        //select option from the dropdown
        drpCountry.selectByVisibleText("Canada");
        Thread.sleep(2000);
        drpCountry.selectByValue("germany");
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
        driver.quit();

    }
}
