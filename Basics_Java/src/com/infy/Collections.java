package com.infy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	public static void main(String[] args) {
//		List<Integer> arrayList = new ArrayList<>();
//		for (int i = 1; i <= 5; i++)
//			arrayList.add(i);
//		System.out.println(arrayList);
		
//		LinkedList<String> list = new LinkedList<>();
//		list.add("Hi");
//		list.add("bye");
//		list.addLast("C");
//		list.addFirst("D");
//		list.add(2, "added in 2nd index");
//		
//		System.out.println(list);
//		
//		list.remove("bye");
//		System.out.println(list);
//		
//		Set<String> hashSet = new HashSet<>();
//		hashSet.add("hi");
//		hashSet.add("bye");
//		hashSet.add("bye");
//		System.out.println(hashSet);
		Set<String> treeSet = new TreeSet();
		treeSet.add("hi");
		treeSet.add("bye");
		treeSet.add("bye");
		System.out.println(treeSet);
	}

}
