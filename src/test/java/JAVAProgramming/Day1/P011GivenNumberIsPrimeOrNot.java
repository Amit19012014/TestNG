package JAVAProgramming.Day1;

//Natural Number > 1
//Which has only two factors 1 and itself

import java.util.Scanner;

public class P011GivenNumberIsPrimeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");



        int num = sc.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime number");
            }

        } else {
            System.out.println("Not a Prime number");
        }

    }
}
