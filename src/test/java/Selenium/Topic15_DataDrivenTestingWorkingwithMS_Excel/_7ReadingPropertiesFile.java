package Selenium.Topic15_DataDrivenTestingWorkingwithMS_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class _7ReadingPropertiesFile {
    public static void main(String[] args) throws IOException {


        // location of properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\config.properties");

        // Create object of properties class
        Properties propertiesobj = new Properties();

        //load the properties file
        propertiesobj.load(file);

        // Reading data from properties file
        String url = propertiesobj.getProperty("appurl");
        String email = propertiesobj.getProperty("email");
        String pwd = propertiesobj.getProperty("password");
        String orid = propertiesobj.getProperty("orderid");
        String custid = propertiesobj.getProperty("customerid");

        System.out.println(url + " " + email + " " + pwd + " " + orid + " " + custid); //abc@gmail.com abcxyz 123 234

        //Reading all the keys from the properties file
        Set<String> keys = propertiesobj.stringPropertyNames();
        System.out.println(keys); //[password, orderid, customerid, appurl, email]

        propertiesobj.keySet();
        Set<Object> keyss = propertiesobj.keySet();
        System.out.println(keyss); //[password, orderid, customerid, appurl, email]

        //Reading all the values from the properties file

        Collection<Object> values = propertiesobj.values();
        System.out.println(values);

        file.close();

    }
}
