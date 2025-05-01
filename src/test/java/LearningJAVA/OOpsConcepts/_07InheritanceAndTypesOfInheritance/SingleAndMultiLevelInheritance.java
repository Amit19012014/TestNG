package LearningJAVA.OOpsConcepts._07InheritanceAndTypesOfInheritance;

class A {
    int a = 100;

    void display() {
        System.out.println(a);
    }
}

class B extends A {
    int b = 200;

    void show() {
        System.out.println(b);
    }
}

class C extends B {
    int c = 300;

    void print() {
        System.out.println(c);
    }
}

public class SingleAndMultiLevelInheritance{
    public static void main(String[] args) {
//        B obj = new B();
//        System.out.println(obj.a);
//        System.out.println(obj.b);
//        obj.display();
//        obj.show();
        C cobj = new C();

        cobj.a = 100;
        cobj.b = 200;
        cobj.c = 300;

        cobj.display();
        cobj.show();
        cobj.print();


    }
}
