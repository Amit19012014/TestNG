package LearningJAVA.OOpsConcepts.Constructor;

public class ConstructorDemo {

    int x, y;

    ConstructorDemo() // default constructor
    {
        x = 100;
        y = 200;
    }
    ConstructorDemo(int a, int b) // Parameterized Constructor
    {
        x=a;
        y=b;
    }
    void  sum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
    ConstructorDemo cd = new ConstructorDemo(); // Invoke default constructor
    cd.sum();
    ConstructorDemo cd1 = new ConstructorDemo(10,20);
    cd1.sum();
    }
}
