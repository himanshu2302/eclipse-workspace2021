package com.java.trainingsessions;

import java.util.Scanner;

public class StringReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String s=sc.nextLine();
		String s1="";
		char[] c= s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {

			if(c[i]==' '&&i>=0) {
				int k=i;
				for(int j=0;j<i;j++) {
					s1=s1+c[k+j];
				}
				s1=s1+' ';
			}

		}
		System.out.println(s1);
	}
}
