package TestNG;

import org.testng.annotations.Test;

// 1- setup open browser or application
//2 - login
//3- close
public class FirstTestCase {
    @Test(priority = 1)
void setup(){
    System.out.println("Opening browser");
}
    @Test(priority = 2)
void login(){
    System.out.println("This is login test");
}
    @Test(priority = 3)
void teardown(){
    System.out.println("Closing the browser");
}
}
