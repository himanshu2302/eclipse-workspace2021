package com.java.trainingsessions;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		char[] c=s.toCharArray();
		System.out.println(s);
		char temp;

		for(int i=0;i<c.length;i++) {
			c[i]=s.charAt(c.length-i-1);
		}
		System.out.println(c);
		String s1 = new String(c);

		if(s.equals(s1)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
