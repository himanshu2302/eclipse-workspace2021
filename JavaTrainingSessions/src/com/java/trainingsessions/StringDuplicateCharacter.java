package com.java.trainingsessions;

public class StringDuplicateCharacter {
	public static void main(String[] args) {

		String s="my name is shubhanshu dubey";

		char c[] = s.toCharArray();

		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]&&c[i]!=' '&&c[i]!='0') {
					System.out.println(c[i]);
					c[j]='0';
					break;
				}
			}
		}
	}
}
