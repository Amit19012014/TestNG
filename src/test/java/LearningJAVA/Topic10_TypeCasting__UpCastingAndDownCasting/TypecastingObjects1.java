package LearningJAVA.Topic10_TypeCasting__UpCastingAndDownCasting;

class Parent{
    String name = "john";
    void m1(){
        System.out.println("this is m1 from parent");
    }
}

class  child extends Parent
{
    int id =  20;
    void m2(){
        System.out.println("this is m2 fom child");
    }
}


public class TypecastingObjects1 {
    public static void main(String[] args) {

//        child c = new child();
//        System.out.println(c.name);
//        c.m1();
//        System.out.println(c.id);
//        c.m2();


        Parent p = new child(); //Upcasting
        System.out.println(p.name);
        p.m1();
//        System.out.println(p.id); //we cannot access
//        p.m2(); //we cannot access

        // Down-casting
//        Parent p1 = new Parent();
//        child c = (child) p1;
//
//
//        System.out.println(c.name);
//        c.m1();
//        System.out.println(c.id);
//        c.m2();



    }
}
