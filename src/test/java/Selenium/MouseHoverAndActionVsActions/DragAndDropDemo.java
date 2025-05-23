package Selenium.MouseHoverAndActionVsActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropDemo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        // Drag and drop

//        Source & Target Element
        WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
        WebElement washington = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
        WebElement UnitedState = driver.findElement(By.xpath("//div[@id=\"box103\"]"));
        WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));
        WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement southCorea = driver.findElement(By.xpath("//div[@id='box105']"));
        WebElement Madrid = driver.findElement(By.xpath("//div[@id='box7']"));
        WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
        WebElement Stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement Sweden = driver.findElement(By.xpath("//div[@id='box102']"));
        WebElement Copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
        WebElement Denmark = driver.findElement(By.xpath("//div[@id='box104']"));


        actions.dragAndDrop(rome, italy).build().perform();
        actions.dragAndDrop(washington, UnitedState).build().perform();
        actions.dragAndDrop(oslo, Norway).build().perform();
        actions.dragAndDrop(seoul, southCorea).build().perform();
        actions.dragAndDrop(Madrid, spain).build().perform();
        actions.dragAndDrop(Stockholm, Sweden).build().perform();
        actions.dragAndDrop(Copenhagen, Denmark).build().perform();
    }
}
