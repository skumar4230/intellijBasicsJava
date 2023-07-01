package com.infy;

import java.util.Iterator;

public class NonPrimitiveDataTypes {
	public static void main(String[] args) {
//		String str = "This is aString";
//		System.out.println(str);
//
//		String str1 = new String("This is also a String");
//		System.out.println(str1);
//
//		int arr[];
//		arr = new int[2];
//		arr[0] = 0;
//		arr[1] = 1;
////		arr[2]=2;
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		int i = 3;
//		i++;
//		System.out.println(i);
//		++i;
//		System.out.println(i++);
//		int a = 4;
//		int b = 4;
//		System.out.println(a == b);
//		for (int n = 0; n <= 8; n++) {
//			System.out.println("Count is : " + n);
//		}
//		int[] numbers = { 1, 2, 3, 34, 4, 5, 6, 7, 8, 9, 10, 11 };
//		//enhanced for loop for iterating over a collection
//		for (int j : numbers) {
//			System.out.println(j);
//
//		}
		
		int[][] two = {{1,4,6},{4,9,8},{2,8,9},{4,6,7}};
        for(int i=0;i<4;i++ ) {
        	for(int j=0;j<3;j++) {
        		System.out.print(two[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
