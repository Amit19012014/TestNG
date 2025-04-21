package LearningJAVA.Array;

import java.util.Scanner;

public class TakingInputfromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Your city is "+city);

    }
}
