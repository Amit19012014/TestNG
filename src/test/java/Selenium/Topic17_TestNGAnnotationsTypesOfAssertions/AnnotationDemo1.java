package Selenium.Topic17_TestNGAnnotationsTypesOfAssertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {


    @BeforeMethod
    void login() {
        System.out.println("This is Login");
    }

    @Test(priority = 1)
    void search() {
        System.out.println("This is  search");
    }

    @Test(priority = 2)
    void advanceSearch() {
        System.out.println("This is   advanceSearch");
    }

    @AfterMethod
    void logOut() {
        System.out.println("This is logout");
    }
}
