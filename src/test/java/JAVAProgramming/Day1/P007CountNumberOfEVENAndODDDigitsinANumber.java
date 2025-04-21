package JAVAProgramming.Day1;

import java.util.Scanner;

public class P007CountNumberOfEVENAndODDDigitsinANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = sc.nextInt();
        int Evencount = 0;
        int OddCount = 0;

        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                Evencount++;
            }
            else {
                OddCount++;
            }
            num = num/10;
        }
        System.out.println("Even Number of Digits ."+Evencount);
        System.out.println("Odd Number of Digits ."+OddCount);


    }
}
