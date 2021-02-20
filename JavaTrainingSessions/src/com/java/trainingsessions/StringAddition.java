package com.java.trainingsessions;

import java.util.Scanner;

public class StringAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s1="himanshu";
		String s2="dubey";

		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println(s1);

	}
}
