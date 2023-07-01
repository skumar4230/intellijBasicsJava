package com.sourav;

public class Shadowing {
	static int x =60;//this will be shadowed in line 7
	public static void main(String[] args) {
		System.out.println(x);
		int x =40;//shadowing can't be possible if we don't initialize it
		
		System.out.println(x);
		
	}

}
