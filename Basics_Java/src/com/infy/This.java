package com.infy;

public class This {
	
	private String name;
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public This(String name) {
		this.name = name;
		System.out.println("name is "+ name);
	}
 public void printName() {
	 System.out.println("name is "+this.name);
	 System.out.println("name is "+name);
 }
 public static void main(String[] args) {
	This t = new This("Sourav");
	t.setName("Sourav Main");
	t.printName();
}
}
