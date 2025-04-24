package LearningJAVA.OOpsConcepts.ClassAndObjects;

public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student();
        st.name ="Amit";
        st.grade='A';
        st.roll_no =101;
        st.display();

        Student st1 = new Student();
        st1.name ="John";
        st1.grade='A';
        st1.roll_no =102;
        st1.display();
    }
}
