package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {
    //A list can contain duplicate elements whereas Set contains unique elements only.
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);


        //LinkedhashSet //maintains insertion order
        LinkedHashSet<String> set3=new LinkedHashSet();
        set3.add("One");
        set3.add("Two");
        set3.add("Three");
        set3.add("Four");
        set3.add("Five");
        Iterator<String> i=set3.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        //TreeSet - maintains natural order
        TreeSet<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //for descending
        Iterator i1= al.descendingIterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

        //Navigable set operations
        TreeSet<String> sett=new TreeSet<String>();
        sett.add("A");
        sett.add("B");
        sett.add("C");
        sett.add("D");
        sett.add("E");
        System.out.println("Initial Set: "+sett);

        System.out.println("Reverse Set: "+sett.descendingSet());

        System.out.println("Head Set: "+sett.headSet("C", true));

        System.out.println("SubSet: "+sett.subSet("A", false, "E", true));

        System.out.println("TailSet: "+sett.tailSet("C", false));
    }

    }

