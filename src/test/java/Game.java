import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bdgcolor9.com/#/saasLottery/WinGo?gameCode=WinGo_1M&lottery=WinGo");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name=\"userNumber\"]")).sendKeys("6396578224");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Amit975931");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"promptBtn\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'Lottery')]")).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Win Go 30s')]")).click();

        Thread.sleep(5000);
        for (int t = 0; t < 5000; t++) {

            for (int i = 2; i <= 2; i++) {
                for (int j = 1; j <= 3; j++) {
                    String cellValue = driver.findElement(By.xpath("(//div[@class='van-row'])[" + i + "]//div[" + j + "]")).getText();

                    System.out.print(cellValue + "\t");
                }
            }
            System.out.println("");
            Thread.sleep(30000);
        }

    }
}
