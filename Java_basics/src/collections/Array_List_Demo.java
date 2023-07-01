package collections;

import java.util.*;

public class Array_List_Demo {
    public static void main(String[] args) {
        //we have to provide wrapper class of primitive datatype as generic otherwise code will nt work
        List<Integer> l = new ArrayList<>();//a good practice
        ArrayList<Integer> l1 = new ArrayList<>();//works same but is a concrete implementation hence not a good practice
        l.add(45);
        l.add(56);
        l.add(55);
        l.add(52);
        l.add(43);
        l.add(25);
//        l.remove(0);//will remove element from specified Index
//        System.out.println(l.size());//will give size of the array
        //iterating the arrayList
        for (int p : l) {
            System.out.println(p);
        }
        Collections.sort(l);//sorting in ascending order
//        System.out.println(l);

        //converting array to list

        //Creating Array
//        String[] array = {"Java", "Python", "PHP", "C++"};
//        System.out.println("Printing Array: " + Arrays.toString(array));
//        //Converting Array to List
//        List<String> list = new ArrayList<String>();
//        for (String lang : array) {
//            list.add(lang);
//        }
//        System.out.println("Printing List: " + list);

        //list to array
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        System.out.println("Printing List: "+fruitList);
       String get= fruitList.get(2);//getting the 3rd object in list as index start from 0
        System.out.println(get);
        //Converting ArrayList to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+Arrays.toString(array));
        //iterating using list iterator
        ListIterator<String> itr=fruitList.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){

            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){

            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
        //using for loop to reverse the array

        for (int i = fruitList.size() - 1; i >= 0; i--) {
            System.out.print(fruitList.get(i) + " ");
        }
        //using for each loop
        Collections.reverse(fruitList); // reverse the list

        for (String element : fruitList) {
            System.out.print(element + " ");
        }

    }
}
