package JAVAProgramming.Day1;

import java.util.Scanner;

public class P009FindLargestOf3Numbers {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first numbers");
        int a = sc.nextInt();
        System.out.println("Enter second numbers");
        int b = sc.nextInt();
        System.out.println("Enter third numbers");
        int c = sc.nextInt();


        //Approach 1
//        if (a > b && a > c) {
//            System.out.println(a + "is a largest number");
//        } else if (b > a && b > c) {
//
//            System.out.println(b + "is a largest number");
//        } else {
//            System.out.println(c + "is a largest number");
//        }

        //Approach 2 Ternary Operator

        int largest1 = a>b?a:b; // largest of a & b;
        int largest2 = c>largest1?c:largest1; // largest of c & largest 1
        System.out.println(largest2+" is largest number");

        int largest =c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(largest);





    }
}
