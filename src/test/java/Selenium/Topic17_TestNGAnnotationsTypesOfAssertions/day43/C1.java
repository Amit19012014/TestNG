package Selenium.Topic17_TestNGAnnotationsTypesOfAssertions.day43;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    @Test
    void abc() {
        System.out.println("this is abc from c1");
    }


    @BeforeTest
    void bt() {
        System.out.println("this is before method");
    }
}
