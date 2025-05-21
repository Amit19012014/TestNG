package Selenium.HandlingAuto_suggestDropdownAndStaticWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Select Portland as departure
        WebElement fromport = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select select = new Select(fromport);
        select.selectByVisibleText("Portland");

        // Select New York as destination
        WebElement toport = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select select1 = new Select(toport);
        select1.selectByVisibleText("New York");

        // Click on Find Flights
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Get number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));

        double minPrice = Double.MAX_VALUE;
        int minIndex = -1;

        for (int r = 1; r <= rows.size(); r++) {
            String priceText = driver.findElement(By.xpath("//table[@class='table']//tbody//tr[" + r + "]//td[6]")).getText();
            double price = Double.parseDouble(priceText.replace("$", "").trim());

            if (price < minPrice) {
                minPrice = price;
                minIndex = r;
            }
        }

        System.out.println("Lowest price found: $" + minPrice);

        // Click on 'Choose This Flight' button in the row with lowest price
        if (minIndex != -1) {
            WebElement chooseButton = driver.findElement(By.xpath("//table[@class='table']//tbody//tr[" + minIndex + "]//td[1]//input"));
            chooseButton.click();
            System.out.println("Clicked on flight with lowest price.");
        }


        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name=\"address\"]")).sendKeys("Delhi");
        driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Noida");
        driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("U.P");
        driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("207123");

        WebElement visa = driver.findElement(By.xpath("//select[@id='cardType']"));
        Select visaa = new Select(visa);
        visaa.selectByValue("amex");

        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345678912");
        driver.findElement(By.xpath("//input[@id=\"creditCardMonth\"]")).sendKeys("8");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2015");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Ami");

        driver.findElement(By.xpath("//input[@name=\"rememberMe\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        String s2 = driver.findElement(By.xpath("//div[@class=\"container hero-unit\"]//h1")).getText();
        System.out.println(s2);

        driver.quit();


    }
}
