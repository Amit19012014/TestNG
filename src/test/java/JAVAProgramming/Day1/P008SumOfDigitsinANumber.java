package JAVAProgramming.Day1;

import java.util.Scanner;

public class P008SumOfDigitsinANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum=0;
        for(int i=0; num>0;i++){
            sum = sum+num%10;
            num=num/10;
        }
        System.out.println("sum of digits in a number = "+sum);
    }
}
