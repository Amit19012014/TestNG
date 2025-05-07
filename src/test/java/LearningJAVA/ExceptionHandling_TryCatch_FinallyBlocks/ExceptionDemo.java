package LearningJAVA.ExceptionHandling_TryCatch_FinallyBlocks;



import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("program is started");

        Scanner sc = new Scanner(System.in);

       //Example 1  .ArithmeticException
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        System.out.println(100/num); // Any number divided by 0 then .ArithmeticException

        //Example 2 ArrayIndexOutOfBoundsException
//        int a[] = new int[5];
//        System.out.println("Enter the position(0-4)");
//        int position = sc.nextInt();
//        System.out.println("Enter a value");
//        int value = sc.nextInt();
//
//        a[position] = value;
//        System.out.println(a[position]);
//        // if we give the number at 5th position then ArrayIndexOutOfBoundsException exception will come

//        Example 3 NumberFormatException
//        String s = "Amit"; // if we give a character string then this exception will come. if we provide the number string then it will not come.
//        int num = Integer.parseInt(s);
//        System.out.println(num);

//        Example 4 NullPointerException
//        String s = null;
//        System.out.println(s.length()); //NullPointerException

        System.out.println("program is completed");
        System.out.println("program is exited");
    }
}
