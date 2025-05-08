package LearningJAVA.Collections_ArrayList_HashSet_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        //Declaration

//        HashMap hm = new HashMap();
//        Map myMap = new HashMap();
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
//        HashMap<Object,Object> hm2 = new HashMap<Object,Object>();

        //Adding pairs
        hm1.put(101, "john");
        hm1.put(102, "Scott");
        hm1.put(103, "mary");
        hm1.put(104, "Scott");
        hm1.put(102, "David");

        System.out.println(hm1);

        // size of a HashMap
        System.out.println("size of a HashMap" + hm1.size());

        // Remove pair
        hm1.remove(103);
        System.out.println("After Remove pair" + hm1);

        // Access the value of key
        System.out.println(hm1.get(102));

        //Get all the keys from HashMap
        System.out.println(hm1.keySet());
        //Get all the values from HashMap
        System.out.println(hm1.values());
        ////Get all key value pair
        System.out.println(hm1.entrySet());

        // reading data from HashMap
        //using for...each
        for (int k : hm1.keySet()) {
            System.out.println(k + "  " + hm1.get(k));
        }

        System.out.println("Using Iterator");

        //Using Iterator

        Iterator<Entry<Integer, String>> i = hm1.entrySet().iterator();

        while (i.hasNext()) {
            Entry<Integer, String> entry = i.next();

            System.out.println(entry.getKey() + "   " + entry.getValue());

        }

        // Clear all the pairs from HashMap
        hm1.clear();
        System.out.println(hm1.isEmpty()); //true



    }
}
