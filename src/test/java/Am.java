import java.util.Arrays;

public class Am {
    public static void main(String[] args) {
        //Counting the words in a string
//       String a = "ram is a good boy";
//       String am[]=  a.split(" ");
//       int count = 0;
//        for (int i=0;i< am.length;i++){
//            System.out.println(am[i]);
//            count++;
//        }
//        System.out.println("This string "+a+" have"+count+" words");

        //Remove the junks character from a string;

//        String s = "A@b#c$d%e";
//        String am = s.replace("@","").replace("#","").replace("$","").replace("%","");
//        System.out.println(am);


         //remove spaces from string
        String s1 = "Ram is a good boy";
        String s2 = s1.replace(" ","");
        System.out.println(s2);

        // verify that string is palindrome or not
//        String s = "MADAM";
//        String rev = "";
//        for(int i=s.length()-1;i>=0;i--){
//            rev = rev+s.charAt(i);
//            //System.out.print(s.charAt(i));
//        }
//        if(s.equals(rev)){
//            System.out.println("String is Palindrom");
//        }else {
//            System.out.println("String is not Palindrom");
//        }

        // Count the occurence of character in string
        String s = "aaabbbaaacccdddaaa";
        int count = 0;
        for (int i = 0; i<s.length();i++){
            if('c'==s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);



    }
}
