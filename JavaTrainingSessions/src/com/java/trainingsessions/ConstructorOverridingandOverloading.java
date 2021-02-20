package com.java.trainingsessions;

public class ConstructorOverridingandOverloading {

	public ConstructorOverridingandOverloading() {
		System.out.println("this is base class constructor");
	}

	public ConstructorOverridingandOverloading(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		ConstructorOverridingandOverloading cd = new ConstructorOverridingandOverloading("himanshu");
		//ConstructorOverridingandOverloading cd1 = new ConstructorOverridingandOverloading("himanshu");
	}




}
