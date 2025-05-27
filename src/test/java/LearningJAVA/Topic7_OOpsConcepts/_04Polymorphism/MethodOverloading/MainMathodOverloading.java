package LearningJAVA.Topic7_OOpsConcepts._04Polymorphism.MethodOverloading;

public class MainMathodOverloading {
    void main(int x){
        System.out.println(x);
    }
    void main(String s){
        System.out.println(s);
    }
    void main(String s1,String s2)
    {
        System.out.println(s1+s2);
    }

    public static void main(String[] args) {

        MainMathodOverloading mo = new MainMathodOverloading();
        mo.main(100);
        mo.main("Amit");
        mo.main("Amit ","Singh");

    }
}
