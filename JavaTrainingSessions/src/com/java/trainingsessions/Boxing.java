package com.java.trainingsessions;

public class Boxing {
	public static void main(String[] args) {
		int i=350;
		System.out.println("Value of i before boxing is : "+i);
		Integer obj = new Integer(i);
		System.out.println("Value of i after boxing is : "+obj);
	}
}
