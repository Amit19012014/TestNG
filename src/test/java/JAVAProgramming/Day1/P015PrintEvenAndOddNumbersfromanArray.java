package JAVAProgramming.Day1;

public class P015PrintEvenAndOddNumbersfromanArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};

//        //Extracting EVEn number
        System.out.println("even number in array");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }

        }


        System.out.println("odd number in array");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }

        }
        System.out.println("even number in array");
        //Using Enhanced for loop.
        for (int v : a) {
            if (v % 2 == 0) {
                System.out.println(v);
            }
        }
        System.out.println("odd number in array");
//         //Using Enhanced for loop.
        for (int v : a) {
            if (v % 2 != 0) {
                System.out.println(v);
            }
        }


    }
}