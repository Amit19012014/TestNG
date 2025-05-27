package LearningJAVA.Topic5_Array;

import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {
        int a[] = {8, 2, 6, 1, 3, 5, 9, 4, 7};

        System.out.println("Before SortingAnArray");
        System.out.println(Arrays.toString(a));

        //Approach 1
        Arrays.sort(a);
        System.out.println("After SortingAnArray");
        System.out.println(Arrays.toString(a));

        //Approach 2
        Arrays.stream(a).sorted().forEach(System.out::print);
    }
}

