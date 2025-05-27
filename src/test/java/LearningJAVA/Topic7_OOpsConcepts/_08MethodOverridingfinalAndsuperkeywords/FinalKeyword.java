package LearningJAVA.Topic7_OOpsConcepts._08MethodOverridingfinalAndsuperkeywords;

class Test{
   final int x = 100;
}

public class FinalKeyword {
    public static void main(String[] args) {
        Test t = new Test();
//        t.x=101; Incorrect, x value is final & constant. we cannot change the value due to final keyword.
        System.out.println(t.x);
    }
}

