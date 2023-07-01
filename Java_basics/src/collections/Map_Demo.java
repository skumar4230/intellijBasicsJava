package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Demo {
    //    A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(104,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(
                Map.Entry m:map.entrySet())

        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);

       // LinkedHashMap -maintains insertion order
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //tree map maintains natural order
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("John", 25);
        treeMap.put("Jophn", 25);
        treeMap.put("Jane", 22);
        treeMap.put("Mike", 35);
        treeMap.put("Emily", 19);

        // Access elements in ascending order of keys
        for (String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }

        // Access elements in descending order of keys
        for (String key : treeMap.descendingKeySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }

    }
}

