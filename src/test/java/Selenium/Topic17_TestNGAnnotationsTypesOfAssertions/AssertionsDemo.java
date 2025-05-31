package Selenium.Topic17_TestNGAnnotationsTypesOfAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    void testTitle() {
        String exp_title = "Opencart";
        String act_title = "Openshop";
//
//        if(exp_title.equals(act_title)){
//            System.out.println("Test Passed");
//        }else {
//            System.out.println("Test failed");
//        }

//        Assert.assertEquals(exp_title,act_title);


        if (exp_title.equals(act_title)) {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        } else {
            System.out.println("Test failed");
            Assert.assertTrue(false);
        }


    }
}
