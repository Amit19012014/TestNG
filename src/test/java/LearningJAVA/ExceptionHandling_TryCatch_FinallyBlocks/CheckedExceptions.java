package LearningJAVA.ExceptionHandling_TryCatch_FinallyBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("Program is started");
        System.out.println("program in progress");


        Thread.sleep(5000);
        FileInputStream file = new FileInputStream("C:\\Users\\amit1\\OneDrive\\Desktop\\Ami.txt");

//        try {
//            FileInputStream file = new FileInputStream("C:\\Users\\amit1\\OneDrive\\Desktop\\Ami.txt");
//        }catch (FileNotFoundException e){
//
//        }

//        try {
//            Thread.sleep(5000);
//        }catch (InterruptedException e)
//        {
//
//        }

        System.out.println("program is completed");
        System.out.println("program is exited");
    }
}
