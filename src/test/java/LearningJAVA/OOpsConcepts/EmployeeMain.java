package LearningJAVA.OOpsConcepts;

public class EmployeeMain {
    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.name="Amit";
        emp.eid = 001;
        emp.job = "QA";
        emp.sal = 100000000;
        emp.display();

        System.out.println("^^^^^^^^^^^^^^^^^^");
        System.out.println("vvvvvvvvvvvvvvvvvv");

        Employee emp1 = new Employee();
        emp1.name ="Yogesh";
        emp1.eid = 002;
        emp1.sal = 10000;
        emp1.job = "sales";
        emp1.display();

    }
}
