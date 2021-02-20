package com.java.trainingsessions;

import java.util.Scanner;

public class StringAlphanumericSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		char[] c=s.toCharArray();
		int sum=0;

		for(int i=0;i<s.length();i++) {
			if(c[i]>=48&&c[i]<=57)
			{
				sum=sum+s.charAt(i)-48;
			}
		}

		System.out.println("Sum of numbers is : "+sum);
	}
}
