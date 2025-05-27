package LearningJAVA.Topic6_String;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        // String = immutable
        String s = "welcome";
        s.concat("to java");
        System.out.println(s); // immutable, cannot change original value of s

        //StringBuffer - mutable
        StringBuffer sb = new StringBuffer("welcome");
        sb.append(" to java");
        System.out.println(sb); // mutable , we can change original value of sb

        //StringBuilder
        StringBuilder sb1 = new StringBuilder("welcome");
        sb1.append(" to selenium");
        System.out.println(sb1);


    }

}
