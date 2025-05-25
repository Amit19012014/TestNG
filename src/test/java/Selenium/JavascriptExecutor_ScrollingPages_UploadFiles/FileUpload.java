package Selenium.JavascriptExecutor_ScrollingPages_UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

//        single file upload
//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\amit1\\OneDrive\\Desktop\\Project\\Viva Solution.pdf");
//        String s = driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
//
//        if(s.equals("Viva Solution.pdf")){
//            System.out.println("File is successfully Uploaded : "+s);
//        }else {
//            System.out.println("Not Uploaded");
//        }


//        multiple file upload
        String file1 = "C:\\Users\\amit1\\OneDrive\\Desktop\\Project\\Viva Solution.pdf";
        String file2 = "C:\\Users\\amit1\\OneDrive\\Desktop\\Project\\Viva Solution1.pdf";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
        int numberoffileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        if(numberoffileUploaded == 2){
            System.out.println("All files are uploaded");
        }else {
            System.out.println("files are not uploaded or incorrect files uploaded");
        }

     // validate files name
        if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Viva Solution.pdf") &&
                driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Viva Solution1.pdf")
        ){
            System.out.println("File names are  matching");
        }else {
            System.out.println("File names are not matching");
        }



    }


}
