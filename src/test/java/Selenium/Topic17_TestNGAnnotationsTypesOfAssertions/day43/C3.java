package Selenium.Topic17_TestNGAnnotationsTypesOfAssertions.day43;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
    @Test
    void pqr() {
        System.out.println("This is pqr from c3");
    }

    @AfterSuite
    void as() {
        System.out.println("This is AfterSuit method");
    }

    @BeforeSuite
    void bs() {
        System.out.println("This is BeforeSuit method");
    }
}
