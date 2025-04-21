package JAVAProgramming.Day1;

import java.util.Scanner;

public class P013FactorialofANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        long factorial = 1;
//        for(int i = 1; i<=num; i++){
//            factorial =factorial*i;
//        }

        for (int i=num; i>=1;i--){
            factorial =factorial*i;
        }

        System.out.println("Factorial of number " + factorial);
    }
}
