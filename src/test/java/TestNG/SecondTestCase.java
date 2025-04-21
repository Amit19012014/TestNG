package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SecondTestCase {
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }
    @Test(priority = 3)
    void searchCustomer(){
        System.out.println("This is searchCustomer test");
        Assert.assertEquals(1,1);
    }
    @Test(priority = 2)
    void addCustomer(){
        System.out.println("This is addCustomer test");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing the browser");
    }
}
