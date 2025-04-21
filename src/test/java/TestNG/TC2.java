package TestNG;

import org.testng.annotations.*;

public class TC2 {


    @BeforeMethod
    void setup(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void tearDown(){
        System.out.println("This will execute after every method");
    }

    @Test
    void  test3(){
        System.out.println("This is test3");
    }
    @Test
    void  test4(){
        System.out.println("This is test4");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before the suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after the suite");
    }

}
