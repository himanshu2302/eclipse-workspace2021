package com.java.trainingsessions;

public class StrinBuilderReverse {
	public static void main(String[] args) {
		String s = "himanshu";

		StringBuilder s1 = new StringBuilder(s);
		StringBuilder reverse = s1.reverse();
		System.out.println(new String(reverse));
	}
}
