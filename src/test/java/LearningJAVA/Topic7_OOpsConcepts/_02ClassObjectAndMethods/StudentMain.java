package LearningJAVA.Topic7_OOpsConcepts._02ClassObjectAndMethods;

public class StudentMain {

    public static void main(String[] args) {
//        Student stu = new Student();
//
//       // 1) using object reference variables
//        stu.sid = 101;
//        stu.sname = "Amit";
//        stu.grad='A';
//        stu.printStudent();


//        // 2) using methods
//        stu.setStudentData(102,"Sumit",'A');
//        stu.printStudent();

        // 3) Using a constructor
        Student stu = new Student(101,"Amit",'A');
        stu.printStudent();


    }
}
