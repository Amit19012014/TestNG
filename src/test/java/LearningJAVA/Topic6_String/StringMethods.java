package LearningJAVA.Topic6_String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //Declaration of String
//        String s = "welcome";
//        String s1 = new String("welcome");


        //length() - returns length of string (number of characters)
        String s = "welcome";
        s.length();
        System.out.println(s.length()); //7
        System.out.println("welcome".length()); //7

        //Concat - joining strings
        String s1 = "welcome";
        String s2 = " to java";
        String s3 = " automation";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2 + s3);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s.concat(s2 + s3));
        System.out.println("welcome" + "to java");
        System.out.println("welcome".concat("to java"));

        // trim() - remove spaces right and left side
        String s4 = "   welcome   ";

        System.out.println(s4); // print string along with spaces
        System.out.println("before trimming " + s4.length());
        System.out.println(s4.trim());
        System.out.println("After trimmed " + s4.trim().length());

        //charAT() - return a character from a string based on the index

        String s5 = "welcome";
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0));

//        for (int i = 0; i<s5.length();i++){
//            System.out.println(s5.charAt(i));
//        }
        //contains() - return true or false (case sensitive)
        // check string is part of main string or not
        String a1 = "Congratulations";
        String a2 = "Cong";
        System.out.println(a1.contains(a2)); //true
        System.out.println(a1.contains("gratu")); //true
        System.out.println(a1.contains("Amit")); //false
        System.out.println(a1.contains("ogau"));//false

        //equals and equalsIgnoreCase() - compare string
        s1 = "welcome";
        s5 = "welcome";
        System.out.println(s1 == s5); //true
        System.out.println(s1.equals(s5)); //true
        System.out.println(s1.equals("welcome")); //true
        System.out.println(s1.equalsIgnoreCase("Welcome"));

        //replace() - replace single/multiple(sequence) of character in a sting

        String str = "welcome to selenium java selenium python selenium c#";
        System.out.println(str);
        System.out.println(str.replace('e', 'x'));
        System.out.println(str.replace("selenium", "Playwright"));

        //substring() - extract substring from the main string;
        //Starting index - 0
        //ending index - 1

        str = "welcome";
        System.out.println(str.substring(1, 4));
        System.out.println(str.substring(0, 4));
        System.out.println(str.charAt(0));

        str = "Selenium";
        System.out.println(str.substring(1, 5)); //elen
        System.out.println(str.substring(0, 3));

        // toUpperCase() toLowerCase()
        str = "Selenium";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //split() - split the string into parts based on delimeter

        s = "abc@gmail.com";
        s.split("@");
        String a[] = s.split("@");
        System.out.println(Arrays.toString(a)); //[abc, gmail.com]

        System.out.println(a[0]); //abc
        System.out.println(a[1]); //@gmail.com

        //ex1
        String amount = "$15,20,55";  // exp 152055


        System.out.println(amount.replace("$", ""));
        System.out.println(amount.replace("$", "").replace(",", ""));


        //ex2
        s = "abc,123@xyz"; //abc 123 xyz
        String arr1[] = s.split(",");
        System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
        String arr2[] = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        //ex3
        s = "abc 123 xyz";
        String am[] = s.split(" ");
        System.out.println(Arrays.toString(am));
//    * % ^ & ( ) - you can not use as delimeter

        //ex4

        String name = "John knedy";
//        System.out.println(name.contains("john"));//false
        System.out.println(name.replace('J', 'j').contains("john"));
        System.out.println(name.toLowerCase().contains("john"));


    }
}
