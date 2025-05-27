package LearningJAVA.Topic7_OOpsConcepts._06UasesofThisAndStaticKeyword;

//import static LearningJAVA.OOpsConcepts._06UasesofThisAndStaticKeyword.StaticKeyword.a;
//import static LearningJAVA.OOpsConcepts._06UasesofThisAndStaticKeyword.StaticKeyword.m1;

public class StaticKeywordMain {
    public static void main(String[] args) {


//      1) Static method can access static stuff directly (without object).
        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();


//        System.out.println(b); //cannot access , b is non static variable
//        m2(); //cannot access , m2 is non-static method

//      2) Static method can access non-static stuff through the object.
        StaticKeyword sk = new StaticKeyword();
        System.out.println(sk.b);
        sk.m2();

        sk.m();

        System.out.println(StaticKeyword.s.length()); //Accessing outside the class


    }
}
