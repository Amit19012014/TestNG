package Selenium.Topic18_TestNGDependencyMethodGroupingTests;

import org.testng.annotations.Test;

public class SignUpTest {

    @Test(priority = 1,groups = {"Regression"})
    void SignupByEmail() {
        System.out.println("This is signup By Email");
    }

    @Test(priority = 1,groups = {"Regression"})
    void SignupByFacebook() {
        System.out.println("This is signup By Facebook");
    }

    @Test(priority = 1,groups = {"Regression"})
    void SignupByTwitter() {
        System.out.println("This is signup By Twitter ");
    }
}
