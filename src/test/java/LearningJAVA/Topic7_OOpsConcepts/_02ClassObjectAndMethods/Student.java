package LearningJAVA.Topic7_OOpsConcepts._02ClassObjectAndMethods;

public class Student {
    int sid;
    String sname;
    char grad;

    void printStudent() {
        System.out.println(sid + " " + sname + " " + grad);
    }

    void setStudentData(int id, String name, char gr) {
        sid = id;
        sname = name;
        grad = gr;
    }

    Student(int id, String name, char gr) {
        sid = id;
        sname = name;
        grad = gr;
    }

}
