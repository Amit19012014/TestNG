package LearningJAVA.Topic10_TypeCasting__UpCastingAndDownCasting;

//A B =(C) D;

public class TypeCastingObjects3 {
    public static void main(String[] args) {

//        Ex-1
//        Object o = new String("welcome");
//        StringBuffer sb = (StringBuffer) o;  // rule 1,2, pass 3 fail

//        Ex-2

//        String s = new String("welcome");
//        StringBuffer sb = (StringBuffer) s; //Rule 1 - failed

//        Ex-3
//        Object o = new String("welcome");
//        StringBuffer sb = (StringBuffer) o; // Rule 1,2, pass 3 failed

//        Ex-4
//        Object o = new String("welcome");
//        StringBuffer sb = (String) o; //Rule 1 pass ,2 - failed

//        Ex-5
//          String s = new String("welcome");
//          StringBuffer sb = (String) s; //Rule 1 pass, 2 - failed

//        EX-6
//        Object o = new String("welcome");
//        StringBuffer sb = (StringBuffer) o; // Rule 1,2, pass 3 failed

//        Ex-7
        Object o = new String("welcome");
        String s = (String) o; // rule 1,2,3 Pass

        System.out.println(s);









    }
}
