package com.java.trainingsessions;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int rev=0;
		System.out.println("Enter a number:");
		a=sc.nextInt();
		int num=a;
		for(int i=0;i<a;) {
			b=a%10;
			rev=(rev*10)+b;
			a=a/10;
		}
		System.out.println(rev);
		if(rev==num) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
}
