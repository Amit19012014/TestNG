package LearningJAVA.Topic5_Array;

public class TwoDimensionalArray { //MultiDimensionalArray
    public static void main(String[] args) {

//           col col
//    row 0  100 200
//    row 1  300 400
//    row 2  500 600

        //Declaring Array
        //Approach 1

//        int a[][] = new int[3][2];
//        //  int [][]a = new int[3][2];
//        // int []a[] = new int[3][2];
//        a[0][0] = 100;
//        a[0][1] = 200;
//
//        a[1][0] = 300;
//        a[1][1] = 400;
//
//        a[2][0] = 500;
//        a[2][1] = 600;

        // Approach 2
        int a1[][] = {{100, 200},
                {300, 400},
                {500, 600}};

        // Find Size of an array
        System.out.println("Length of row = " + a1.length);
        System.out.println("Length of columns = " + a1[0].length);

        // Read Single value from array
//        System.out.println(a1[2][1]);

        //Read all the data from array
        for (int i = 0; i <= a1.length - 1; i++) {
            for (int j = 0; j <= a1[i].length - 1; j++) {

                System.out.print(a1[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("================");
        for (int arr[] : a1) {

            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
}
