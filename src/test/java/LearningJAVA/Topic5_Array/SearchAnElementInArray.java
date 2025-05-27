package LearningJAVA.Topic5_Array;

import java.util.Scanner;

// Search an element in array.(linear Search)
public class SearchAnElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int num = sc.nextInt();
        boolean status = false; //false - not found true - dound
        int a[] = {1, 2, 3, 4, 5};
//        for (int i = 0; i <= a.length - 1; i++) {
//            if (a[i] == num) {
//                System.out.println("Element found ");
//                status = true;
//                break;
//            }
//        }
        for (int x : a) {
            if (x == num) {
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println("Element not found");
        }
    }
}
