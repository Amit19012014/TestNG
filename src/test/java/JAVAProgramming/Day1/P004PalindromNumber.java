package JAVAProgramming.Day1;

import java.util.Scanner;

public class P004PalindromNumber {
    public static void main(String[] args) {
       // A palindrome number is a number that remains the same when its digits are reversed . Like 16461

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();
        int org_num = num;

        int rev = 0;
        while (num!=0)
        {
            rev=rev*10 + num%10;
            num=num/10;
        }

        if
        (org_num==rev){
            System.out.println(org_num+"is a palindrome Number");
        }
        else {
            System.out.println(org_num+"this is  not a palindrome Number");
        }

    }
}
