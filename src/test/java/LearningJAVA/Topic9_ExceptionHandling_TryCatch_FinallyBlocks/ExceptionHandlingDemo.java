package LearningJAVA.Topic9_ExceptionHandling_TryCatch_FinallyBlocks;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("program is started");

        Scanner sc = new Scanner(System.in);

        //Example 1  .ArithmeticException
        System.out.println("Enter a number");
        int num = sc.nextInt();

        try {
            System.out.println(100 / num); //ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Invalid data");
        }

        System.out.println("program is completed");
        System.out.println("program is exited");



        //Example 2 ArrayIndexOutOfBoundsException
        int a[] = new int[5];


        System.out.println("Enter the position(0-4)");
        int position = sc.nextInt();

        System.out.println("Enter a value");
        int value = sc.nextInt();

        a[position] = value;
        System.out.println(a[position]);

        // if we give the number at 5th position then ArrayIndexOutOfBoundsException exception will come


    }
}
