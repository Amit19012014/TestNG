package LearningJAVA.Topic8_WrapperClasses_DataConversion_Packages_AccessModifiers;

public class DataConversionMethods {
    public static void main(String[] args) {

//        1) String ----> int  Integer.parseInt(String value)
//            String s = "welcome"; cannot convert into int
//        String s = "12345";
//        int sint = Integer.parseInt(s);
//        System.out.println(sint);

        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

//        2) String ----> double Double.parseDouble(String value)

        String s3 = "20.50";
        String s4 = "50.10";
        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));


//        3) String ----> boolean Boolean.parseBoolean(String value)
        String s5 = "True";
        String s6 = "False";

        System.out.println(Boolean.parseBoolean(s5));
        System.out.println(Boolean.parseBoolean(s6   ));

//        4) String -----> char Not possible


        //1) Int ,double,bool,char -------> String
        int a = 100;
        double d = 10.5;
        char c ='A';
        boolean bool = true;

        String s = String.valueOf(a);
        System.out.println(s);

        s=String.valueOf(d);
        System.out.println(d);

        s=String.valueOf(c);
        System.out.println(c);

        s=String.valueOf(bool);
        System.out.println(bool);



//        System.out.println(String.valueOf(a));
//        System.out.println(String.valueOf(d));
//        System.out.println(String.valueOf(c));
//        System.out.println(String.valueOf(bool));




    }
}
