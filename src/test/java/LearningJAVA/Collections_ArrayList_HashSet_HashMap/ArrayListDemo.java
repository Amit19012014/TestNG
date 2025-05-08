package LearningJAVA.Collections_ArrayList_HashSet_HashMap;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
};

public class ArrayListDemo {
    public static void main(String[] args) {


        //Declaration

        //For Heterogeneous Data
//        ArrayList myList = new ArrayList();
//        List mylist1 = new ArrayList();

        // For Homogeneous Data
//        ArrayList<Integer> myList = new ArrayList<Integer>();
//        ArrayList<String> myList1 = new ArrayList<String>();


        // For Classes
//        ArrayList<Employee> myList = new ArrayList<Employee>();


        ArrayList myList = new ArrayList();

        //Adding data into arrayList
        myList.add(100);
        myList.add(10.5);
        myList.add("Welcome");
        myList.add('A');
        myList.add(true);
        myList.add(100);
        myList.add(null);
        myList.add(null);

        //Size of ArrayList
        System.out.println("Size of an ArrayList = " + myList.size());

        //Printing the ArrayList
        System.out.println("printing the ArrayList :" + myList);

        //Remove some element (object) from ArrayList
        myList.remove(5);
        System.out.println("After removing the ArrayList :" + myList);

        // Insert element in ArrayList
        myList.add(5, 100);
        myList.add(2, "java");
        System.out.println("After inserting : " + myList);

        //Modify the element in the ArrayList (modify , replace , change)
        myList.set(2, "Python");
        System.out.println("After modify/replacing  : " + myList);

        //Accessing the specific element/object
        System.out.println(myList.get(3)); //here 3 is index

        // reading all the element from ArrayList
        //Using normal for loop()
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("  //Using Enhanced for...each loop");
        //Using Enhanced for...each loop

        for (Object x : myList) {
            System.out.println(x);
        }


        System.out.println("//Using Iterator");
        //Using Iterator
        Iterator<Object> it = myList.iterator();
//        Iterator<String> it1 = myList.iterator();
//        Iterator<Integer> it2 = myList.iterator();
//        Iterator<Object> it3 = myList.iterator();


//        System.out.println(it.next()); it will print only first element
//        hasNext() is use for checking the next element is present or not

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Checking ArrayList is empty or not
        System.out.println(myList.isEmpty());

        //Remove multiple elements in ArrayList
        ArrayList myList2 = new ArrayList();
        myList2.add(100);
        myList2.add("welcome");


        myList.removeAll(myList2);
        System.out.println("After Remove multiple elements in ArrayList" + myList);


        //Remove/clear all the elements from the ArrayList
        myList.removeAll(myList);
        myList.clear();
        System.out.println(myList.isEmpty());


    }
}

