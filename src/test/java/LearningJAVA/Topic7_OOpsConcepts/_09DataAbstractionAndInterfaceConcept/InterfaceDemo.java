package LearningJAVA.Topic7_OOpsConcepts._09DataAbstractionAndInterfaceConcept;

interface shape {
    int length = 11; // final and static variable
    int width = 20; // final and static

    void circle(); // abstract methods

    default void square() { // default methods are allowed.
        System.out.println("this is a square - default method");
    }

    static void rectangle() {
        System.out.println("this is rectangle - static method");
    }
}

public class InterfaceDemo implements shape {

    int x=100,y=100;
    public void circle() {
        System.out.println("This is circle = abstract method");
    }

    void triangle() {
        System.out.println("this is triangle method");
    }

    public static void main(String[] args) {


        // Scenario 1
        InterfaceDemo i = new InterfaceDemo(); // for the same class
        i.circle(); // abstract
        i.square(); // default
        shape.rectangle(); // static method can directly access from interface
        i.triangle();
        System.out.println(i.x*i.y);

        // Scenario 2
        //We can create Object reference for Interface but we cannot instantiate interface.

        shape s = new InterfaceDemo();
        s.circle();// abstract
        s.square();// default
        shape.rectangle(); //  static method can directly access from interface
        System.out.println(shape.length);
        System.out.println(shape.width);
        System.out.println(shape.width*shape.length); // accessing static variables directly
        System.out.println(i.x*shape.length);

    }
}
