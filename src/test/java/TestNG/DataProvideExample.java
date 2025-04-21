package TestNG;

import org.testng.annotations.Test;


public class DataProvideExample {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = customDataProvider.class)
    public void loginTest(String email, String pwd){
        System.out.println(email+" "+pwd);
    }


}
