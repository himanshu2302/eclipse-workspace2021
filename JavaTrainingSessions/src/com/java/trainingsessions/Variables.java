package com.java.trainingsessions;

public class Variables {
	public static void add() {
		int a,b;
	}
	static int a = 10;
public static void main(String[] args) {
	Variables v1 = new Variables();
	Variables v2 = new Variables();
	if(v1 instanceof Variables) {
		System.out.println("This is instance of Variable class");
	}
	else {
		System.out.println("This is not instance of class");
	}
	v1.a = 20;
}
}
