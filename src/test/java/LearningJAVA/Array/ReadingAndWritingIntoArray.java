package LearningJAVA.Array;

import java.util.Scanner;

public class ReadingAndWritingIntoArray {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number" +i+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing array elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
