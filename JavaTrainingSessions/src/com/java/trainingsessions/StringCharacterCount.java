package com.java.trainingsessions;

import java.util.Scanner;

public class StringCharacterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		int count =0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=65||s.charAt(i)<=90)&&s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Number of charcaters in the string is: "+count);
	}
}
