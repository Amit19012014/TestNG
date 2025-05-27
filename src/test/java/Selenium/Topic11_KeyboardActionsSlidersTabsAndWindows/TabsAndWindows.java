package Selenium.Topic11_KeyboardActionsSlidersTabsAndWindows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.get("https://demo.nopcommerce.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
}
