package LearningJAVA.String;

import java.util.Arrays;

public class mutableAndImmutable {

    public static void main(String[] args) {
        //Mutable = can change

        int a[] = {20, 10, 40, 50, 30};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a); //Mutable changing the array element
        System.out.println(Arrays.toString(a));

        //Immutable - cannot change
        String s = new String("welcome");
        System.out.println(s); //welcome
        String concatString=s.concat("to java");
        System.out.println(s); //welcome ---> Immutable - we cannot change
        System.out.println(concatString);

    }
}
