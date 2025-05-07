package LearningJAVA.TypeCasting__UpCastingAndDownCasting;

//Upcasting - Converting value from smaller to larger.
// int ----> long
// float ----> Double

//Down-Casting -  Converting value from larger to smaller.
//long ----->int
//Double ---> float

public class TypeCastingConcept {
    public static void main(String[] args) {
//Upcasting == automatic -------- smaller to larger.
//        int intvalue = 100;
//        long longvalue = intvalue;
//        System.out.println(longvalue);
//
//        float floatvalue = 10.5F;
//        double doublevalue = floatvalue;
//        System.out.println(doublevalue);

//Down-Casting -  Manually --------- larger to smaller.
        long longvalue = 10000;
        int imtvalue = (int) longvalue;

        double doublevalue = 125.55;
        float floatvalue = (float)doublevalue;

        //example1
        int i = 100;
        double d = i;  //Upcasting
        System.out.println(d);

        //example 2 Downcasting
        double d1 = 10.5;
        int i1 = (int) d;
        System.out.println(i1);



    }
}
