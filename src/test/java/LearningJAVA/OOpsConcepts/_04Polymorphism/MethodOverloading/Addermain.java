package LearningJAVA.OOpsConcepts._04Polymorphism.MethodOverloading;

public class Addermain {
    public static void main(String[] args) {
        Adder ad = new Adder();

        ad.sum();
        ad.sum(100,200);
        ad.sum(10.2,20);
        ad.sum(10,20.10);
        ad.sum(10,20,30);
//        ad.sum(10.5,20.5,30.5) // Invalid
    }
}
