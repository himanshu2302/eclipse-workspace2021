package com.java.trainingsessions;

public class StringSplit {
	public static void main(String[] args) {
		String s1 = "My name is himanshu dubey and nickname is rohit";

		int count=1;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);

	}
}
