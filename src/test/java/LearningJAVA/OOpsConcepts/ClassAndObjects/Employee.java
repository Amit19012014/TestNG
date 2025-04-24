package LearningJAVA.OOpsConcepts.ClassAndObjects;

public class Employee {

    //Variables
    int eid;
    String name;
    String job;
    int sal;

    //Method
    void display() {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(job);
        System.out.println(sal);
    }


//    public static void main(String[] args) {
//
//        Employee emp = new Employee();
//        emp.name="Amit";
//        emp.eid = 001;
//        emp.job = "QA";
//        emp.sal = 100000000;
//        emp.display();
//
//        System.out.println("=======================");
//        Employee emp1 = new Employee();
//        emp1.name ="Yogesh";
//        emp1.eid = 002;
//        emp1.sal = 10000;
//        emp1.job = "sales";
//        emp1.display();
//
//
//    }
}
