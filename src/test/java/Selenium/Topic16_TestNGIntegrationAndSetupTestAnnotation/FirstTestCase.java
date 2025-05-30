package Selenium.Topic16_TestNGIntegrationAndSetupTestAnnotation;

/*
1) Open app
2) Login
3) Logout
 */
import org.testng.annotations.Test;

public class FirstTestCase {


    @Test(priority = 1)
    public void OpenApp() {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("OpenApp");
    }

    @Test(priority = 2)
    public void Login() {
        System.out.println("Login to application");
    }

    @Test(priority = 3)
    public void Logout() {
        System.out.println("Logout from application");
    }

    @Test(priority = 4)
    public void OpenApp1() {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Passed : OpenApp");
    }

    @Test(priority = 5)
    public void Login1() {
        System.out.println("Passed : Login");
    }

    @Test(priority = 6)
    public void Logout1() {
        System.out.println("Passed : Logout");
    }
}
