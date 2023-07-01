package com.sourav;

import java.util.Arrays;
//varargs means variable arguments
public class Varargs {
	public static void main(String[] args) {
		math(45,56,25,366,365,2624,24,25,4);
		strings("MY","name","is ","Sourav");
		mixed(54,"okjcdj","jkijjcdid");
	}
	static void math(int ...c) {//can take any datatype
		System.out.println(Arrays.toString(c));
		
	}
	///... internally uses an array of specified datatype 
	//here it is String
	static void strings(String ...s) {//can take any datatype
		System.out.println(Arrays.toString(s));
		
	}

	//we can also use variable datatypes with mixed 
	static void mixed(int a, String ...b) {
		System.out.println(Arrays.toString(b));
		System.out.println(a);
		
	}
	
}
