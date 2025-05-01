package LearningJAVA.OOpsConcepts._08MethodOverridingfinalAndsuperkeywords;




public class AnimalSuperKeyword {
String color = "white";
 void  eat(){
    System.out.println("eating-----");
}
}
class Dog extends AnimalSuperKeyword
{
    String color = "black";
    void display(){
//        System.out.println(color);
        System.out.println(super.color);
    }
    void eat(){
//        System.out.println("eating bread");
        super.eat();
    }

}
