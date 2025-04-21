package LearningJAVA.Array;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String[] args) {
//        String[] s = {"Amit","Anish","ABC","xyz"};
        String[] s = {"D","C","B","A"};
        System.out.println("Before SortingStrings"+Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After sortingString"+Arrays.toString(s));

    }
}
