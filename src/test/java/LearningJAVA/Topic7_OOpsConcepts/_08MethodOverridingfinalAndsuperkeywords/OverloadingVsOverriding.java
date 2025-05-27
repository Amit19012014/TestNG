package LearningJAVA.Topic7_OOpsConcepts._08MethodOverridingfinalAndsuperkeywords;

class ABC {
    void m1(int a) {
        System.out.println(a);
    }

    void m2(int b) {
        System.out.println(b);
    }
}

class XYZ extends ABC {
    void m1(int a) // Overriding
    {
        System.out.println(a * a);
    }
    void m2(int b) {
        System.out.println(b*b);
    }

    void m2(int a, int b) // Overloading
    {
        System.out.println(a + b);
    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {

        XYZ xyz = new XYZ();

        xyz.m1(5);
        xyz.m1(10);
        xyz.m2(6);
        xyz.m2(2, 5);

    }
}
