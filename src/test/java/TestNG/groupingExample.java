package TestNG;

import org.testng.annotations.Test;

public class groupingExample {

    @Test(groups = {"Sanity"})
    void test1() {
        System.out.println("This is test1");
    }

    @Test(groups = {"Sanity"})
    void test2() {
        System.out.println("This is test2");
    }

    @Test(groups = {"Regression"})
    void test3() {
        System.out.println("This is test3");
    }

    @Test(groups = {"Regression"})
    void test4() {
        System.out.println("This is test4");
    }

    @Test(groups = {"Sanity", "Regression"})
    void test5() {
        System.out.println("This is test5");
    }
}
