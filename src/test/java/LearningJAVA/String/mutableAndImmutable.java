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
        System.out.println(s.concat("to java"));
        System.out.println(s); //welcome ---> Immutable - we cannot change
        String concatString=s.concat("to java");
        System.out.println(concatString);

        System.out.println("=====================");
        String s1 = "knowledge";
                   // s2 points to the same "knowledge"
       String  s2 = s1.concat(" base");   // creates a new String "knowledge base"
        System.out.println(s1);
        System.out.println(s2);

    }
}
