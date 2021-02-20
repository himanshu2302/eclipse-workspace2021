package com.java.trainingsessions;

public class StringTest {
	public static void main(String[] args) {

		String s = "Ananthpuram";
		String substring = s.substring(6, 11);
		System.out.println(s);
		System.out.println(substring);

		String s1 = "ram is a good boy";
		String replace = s1.replace("good", "bad");
		System.out.println(replace);

		String[] split = s1.split("boy");
		String snew = split.toString();
		System.out.println(snew);
		for(int i=0;i<split.length;i++) {
			System.out.println(split);
		}
	}
}
