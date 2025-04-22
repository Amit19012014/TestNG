package LearningJAVA.String;

public class ReverseAString {
    public static void main(String[] args) {
//        String a = "welcome";
//        String rev = "";
//        //Approach 1 lenghth() , charAt
//        for (int i = a.length()-1;i>=0;i--){
//            rev= rev+a.charAt(i);
//        }
//        System.out.print("Reverse String is "+rev);

        //Approach 2 Without using string method
        // By converting string to char array type
//        String s = "welcome";
//        String rev ="";
//        char a[] = s.toCharArray(); //convert a string into array
//
//        for (int i= a.length-1;i>0;i--){
//            rev= rev+a[i];
//        }
//        System.out.print("Reverse String is "+rev);

        //Approach 3 Using StringBuffer class

        StringBuffer s = new StringBuffer("welcome");
        System.out.println(s);
        System.out.println("Reverse a string = "+ s.reverse());

        //Approach 4 Using StringBuilder class

        StringBuilder s1 = new StringBuilder("welcome");
        System.out.println(s1);
        System.out.println("Reverse a string = "+ s1.reverse());










    }
}
