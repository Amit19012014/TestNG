package LearningJAVA.Array;

import java.util.Scanner;

public class SearchRepetedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int a[] = {1,1,2,3,4,4,5,5};
        int count=0;
//        for(int i=0;i<a.length;i++){
//            if(number==a[i]){
//                count++;
//            }
//        }
        for (int value : a) {
            if(value == number){
                count++;
            }
        }
        System.out.println(count);


    }
}
