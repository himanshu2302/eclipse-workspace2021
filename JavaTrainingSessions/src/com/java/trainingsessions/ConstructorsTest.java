package com.java.trainingsessions;

public class ConstructorsTest {
	static int i=0;
	public ConstructorsTest() {
		i++;
		System.out.println(i);
	}
	public static void main(String[] args) {
		ConstructorsTest c1 = new ConstructorsTest();
		ConstructorsTest c2 = new ConstructorsTest();
		ConstructorsTest c3 = new ConstructorsTest();
	}
}
