package LearningJAVA.OOpsConcepts._06UasesofThisAndStaticKeyword;

public class StaticKeyword {
    static int a = 10; //static variable
    int b = 20; //non-static variable

    static void m1() // static method
    {
        System.out.println("m1 is static method");
    }

    void m2() //non-static method
    {
        System.out.println("m2 is  non-static method");
    }
    void m() //non-static method
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    static String s = "Welcome";

//    public static void main(String[] args) {
//
//
////      1) Static method can access static stuff directly (without object).
//        System.out.println(a);
//        m1();
//
//
////        System.out.println(b); cannot access , b is non static variable
////        m2(); cannot access , m2 is non-static method
//
////      2) Static method can access non-static stuff through the object.
//        StaticKeyword sk = new StaticKeyword();
//        System.out.println(sk.b);
//        sk.m2();
//
//        sk.m();
//
//
//    }
}
