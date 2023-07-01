package com.infy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	//helps to iterating and manipulate collections
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
//		List<Integer> l1= new ArrayList<>();
//		for (Integer i : list) {
//			l1.add(i*i);
//		}
//		System.out.println(l1);
//		
		List<Integer> sqList=list.stream().map(x-> x*x).collect(Collectors.toList());
          System.out.println(sqList);	
	 
          //Stream reduce(Identity,accumulator,combiner)//here is no combiner
          int sum = list.stream().reduce(0, (ans,i)->(ans+i));
          System.out.println("Sum of all the numbers: "+sum);
	}
	

}
