package LearningJAVA.Topic5_Array;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int first = sc.nextInt();
//        System.out.println("Enter second number");
//        int second = sc.nextInt();
//        System.out.println("Enter third number");
//        int third = sc.nextInt();
//        System.out.println((first+second+third));

        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Your name: "+name);

        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Your age: "+age);

        System.out.println("Enter the unknown value");
        Object value = sc.next();
        System.out.println("Your unknown value: "+value);


    }

}
