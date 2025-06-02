package Selenium.Topic18_TestNGDependencyMethodGroupingTests;

import org.testng.annotations.Test;

public class PaymentTest {
    @Test(priority = 1,groups = {"Sanity","Regression","Functional"})
    void paymentInRupees() {
        System.out.println("This is Payment in Rupees");
    }

    @Test(priority = 2,groups = {"Sanity","Regression","Functional"})
    void paymentInDollars() {
        System.out.println("This is Payment in Dollars");
    }

}
