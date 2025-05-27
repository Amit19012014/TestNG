package LearningJAVA.Topic7_OOpsConcepts._05Encapsulation;

public class Accountmain {
    public static void main(String[] args) {
        Account acc = new Account();
//        acc.accno = 1001;
//        acc.name = "Amit";
//        acc.amount =10000;

        acc.setAccno(1011);
        System.out.println(acc.getAccno());
        acc.setName("Amit");
        System.out.println(acc.getName());
        acc.setAmount(1000000000);
        System.out.println(acc.getAmount());
    }
}
