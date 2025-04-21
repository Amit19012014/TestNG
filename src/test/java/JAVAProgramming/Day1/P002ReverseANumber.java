package JAVAProgramming.Day1;

import java.util.Scanner;

public class P002ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        // 1-Using algorithm
//        int rev = 0;
//
//        while (num != 0) {
//            rev = rev * 10 + num % 10;
//            num = num / 10;
//        }
//

        // 2 - using string buffer class

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println("Reverse Number is:" + rev);


        // 3 StrinBuilder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse Number is:" + rev);

    }
}
