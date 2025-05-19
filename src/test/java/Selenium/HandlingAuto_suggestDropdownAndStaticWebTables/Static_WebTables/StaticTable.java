package Selenium.HandlingAuto_suggestDropdownAndStaticWebTables.Static_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Find Total number of rows
        List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("Number of rows : "+row.size());

        int row1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

        for (int i = 0; i < row.size(); i++) {
            System.out.println("Number of columns in table : "+row.get(i).getText());
        }

        List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
        int col1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
        System.out.println("Number of columns in table : "+cols.size()); //4

        for (int i = 0; i < cols.size(); i++) {
            System.out.println(cols.get(i).getText());
        }

        WebElement Bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
        System.out.println("Book Name : "+Bookname.getText()); //Master In Selenium

        WebElement Subjectname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]"));
        System.out.println("Subject Name : "+Subjectname.getText());

        // read data from all the rows and columns

        System.out.println("BookName"+"\t"+"Authot"+"\t"+"Subject"+"\t"+"Price");
        for (int r = 2; r <= row1 ; r++) {

            for (int c = 1; c <= col1 ; c++) {

                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value+"\t");
            }
            System.out.println();
        }

        // Print the book name whose author name is Mukesh

        for (int r = 2; r <= row1 ; r++) {
           String Author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
           if (Author.equals("Mukesh")) {
             String Bookname1 =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
               System.out.println("BookName : "+Bookname1+"  Author : "+Author);
           }
        }

        int total = 0;

        // find total price of all the book
        for (int r = 2; r <= row1 ; r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total =total+ Integer.parseInt(price);

        }
        System.out.println("Total price of the books : "+total);


           driver.quit();
    }
}
