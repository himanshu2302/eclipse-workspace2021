package com.java.trainingsessions;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		//String s = "boy good is himanshu";
		//System.out.println(s.charAt(3));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		char [] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {

			c[i]=s.charAt(c.length-1-i);
			//System.out.println(c[i]);


		}

		//		for(int i=0;i<c.length;i++) {
		//			System.out.println(c[i]);
		//		}
		System.out.println(new String(c));
		//
		//		//		char[] try1 = input.toCharArray();
		//		//
		//		//		for (int i = try1.length - 1; i >= 0; i--)
		//		//			System.out.print(try1[i]);

		//		StringBuilder builder = new StringBuilder(s);
		//		System.out.println(builder);
		//		StringBuilder reverse = builder.reverse();
		//		System.out.println(reverse);

	}
}
