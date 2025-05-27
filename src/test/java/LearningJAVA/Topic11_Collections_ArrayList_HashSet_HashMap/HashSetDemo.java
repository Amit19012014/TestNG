package LearningJAVA.Topic11_Collections_ArrayList_HashSet_HashMap;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        //declaration
        HashSet mySet = new HashSet();
//        Set mySet1 = new HashSet();
//        HashSet<Objects> mySet2 = new HashSet();
//        HashSet<String> mySet2 = new HashSet<String>();
//        HashSet<Integer> mySet2 = new HashSet<Integer>();

        //Adding element in HashSet
        mySet.add(100);
        mySet.add(10.5);
        mySet.add("welcome");
        mySet.add(true);
        mySet.add('A');
        mySet.add(100);
        mySet.add(null);
        mySet.add(null);

        //Printing HashSet
        System.out.println(mySet); //[null, A, 100, 10.5, welcome, true]

        //Size of HashSet
        System.out.println("size of HashSet" + mySet.size());

        //Remove specific element/value from HashSet
        mySet.remove(10.5);
        System.out.println("After removing" + mySet);

        //Inserting element
        //It is not possible

        //Accessing the specific element
        //Directly It is not possible to access the specific element

//        Converting HashSet into ArrayList
        ArrayList al = new ArrayList(mySet);
        System.out.println(al); //[null, A, 100, welcome, true]
        System.out.println(al.get(2));

        //read all the element using enhanced for...each loop
        for (Object x : mySet) {
            System.out.println(x);
        }

        // Using iterator

        Iterator<Objects> i = mySet.iterator();
        i.next();

        System.out.println("============");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //Clearing all the elements in hashSet
        mySet.clear();
        System.out.println(mySet);
        System.out.println(mySet.isEmpty());

    }
}
