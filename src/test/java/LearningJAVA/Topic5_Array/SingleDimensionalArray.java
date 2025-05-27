package LearningJAVA.Topic5_Array;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        //Declaring array

        //Approach 1
        int a[] = new int[5];
        a[0] = 500;
        a[1] = 100;
        a[2] = 200;
        a[3] = 300;
        a[4] = 400;


        //Approach 2
        int a1[] = {1, 2, 3, 4, 5};


        // Find the size of an array
        System.out.println("Length of array" + a1.length);

        //Read value from array
        System.out.println(a[0]);
        System.out.println(a1[0]);

        //Read all the data from array
        for (int i = 0; i < a.length; i++) // i<4; i<5; i<-a.length; i<-a.length-1;
        {
            System.out.println(a[i]);
        }

        //Enhanced for loop
        for (int array : a1) {
            System.out.println(array);
        }

        String S[] = {"Amit", "Yogesh", "Ankit"};

        //Enhanced for loop
        for (String array1 : S) {
            System.out.println(array1);
        }


    }
}
