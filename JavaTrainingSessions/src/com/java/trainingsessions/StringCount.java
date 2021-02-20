package com.java.trainingsessions;

public class StringCount {
	public static void main(String[] args) {

		String s = "ram and laxmana";

		//converting string to character array
		char[] c=s.toCharArray();

		//loop statement for taking count of each character
		for(int i=0;i<s.length();i++) {
			int count=1;

			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]&&c[i]!=' ') {

					count++;
					//to avoid printing the duplicate character
					c[j]='1';

				}
			}

			//print the count of each character
			if(c[i]!=' '&&c[i]!='1') {
				System.out.println(c[i]+" - "+count);
			}

		}		

	}
}
