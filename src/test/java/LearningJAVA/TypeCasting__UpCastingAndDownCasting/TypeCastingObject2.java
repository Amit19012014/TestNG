package LearningJAVA.TypeCasting__UpCastingAndDownCasting;

//Cat ct = (Cat) an1;
//A   B      C    D


class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}


public class TypeCastingObject2 {
    public static void main(String[] args) {
//        Animal an = new Animal();

        //Rule 1 : Conversion is valid or not
        // The type of 'D' and 'C' must have some relationship (either parent to child or child to parent
//
//        Animal an1 = new Dog();
//        Cat ct = (Cat) an1; // Valid as per rule 1
////       A   B      C    D


//        Dog dg = new Dog();
//        Cat ct = (Cat) dg; // Invalid as per rule 1


        //Rule 2 Assignment is valid or not
        //'C' must be either same or child of 'A'

//        Animal an = new Dog();
//        Cat ct = (Cat) an; // Valid as per rule 2

//        Animal an = new Dog();
//        Cat ct = (Dog) an; // Invalid as per rule 2

        //Rule 3 :
        // The underlying object type of 'D' must be either same or child of 'C'.
//        Animal an = new Dog();
//        Cat ct = (Cat) an; //Invalid as per rule 3
        //Rune time error - ClassCastException


        //Rule 1,2,3

        Animal an = new Dog();
        Dog dg = (Dog) an; //Rule 1,2,3 satisfied.
    }

}
