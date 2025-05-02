package LearningJAVA.OOpsConcepts.DataAbstractionAndInterfaceConcept.MultipleInheritanceAndHybridInheritance;

public class C1 extends C2 implements I1, I2 {

    public void m1() {
        System.out.println(x);
    }
    public void m2(){
        System.out.println(y);
    }

    public static void main(String[] args) {

        C1 c = new C1();
        c.m1();
        c.m2();
        c.m3();

    }
}
