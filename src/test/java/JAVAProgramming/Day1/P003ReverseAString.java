package JAVAProgramming.Day1;

public class P003ReverseAString {
    public static void main(String[] args) {
        //Approach 1 using Concatenation operator

        String str = "ABCD";
        String rev = "";

//        int len = str.length();
//
//        for (int i = len - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println("Reversed string is =>" + rev);

        // Approach 2 using character array

//        char a[]= str.toCharArray();
//        int len= a.length;
//        for (int i = len-1;i>=0;i--)
//        {
//            rev=rev+a[i];
//        }
//        System.out.println("Reversed string is =>" + rev);

        // Approach 3  Using String Buffer class

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
