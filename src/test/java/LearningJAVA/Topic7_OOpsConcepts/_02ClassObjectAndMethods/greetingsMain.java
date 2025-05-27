package LearningJAVA.Topic7_OOpsConcepts._02ClassObjectAndMethods;

public class greetingsMain {
    public static void main(String[] args) {
        greetings g = new greetings();
        g.m1();
        String s = g.m2();
        System.out.println(s);
        g.m3("Amit");
        String var = g.m4("Amit");
        System.out.println(var);
    }
}
