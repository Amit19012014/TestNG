package LearningJAVA.OOpsConcepts.ClassObjectAndMethods;


public class greetings {

    //1)No params  || No return value
    public void m1() {
        System.out.println("Hello");
    }

    //2)No Params  || Return Value

    String m2() {

        return ("Hello How are you");

    }
    //3)Take params|| No return value
    void m3(String name){
        System.out.println("Hello "+name);
    }

    //4)Take params|| Return value
//    void m4(String name, int id, String city){
//        System.out.println(name+" "+id+" "+city);
//    }
    String m4(String name){
        return ("Hello "+ name);
    }

}
