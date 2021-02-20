package com.java.trainingsessions;

public class ArraySorting {
	public static void main(String[] args) {
		int [] ar = new int[]{8,10,12,7,6,14,4,23,89,43,15,35,67,76,29,18,87,101,98,5,2,100};
		//System.out.println(ar);

		int temp;

		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i]; 
					ar[i]=ar[j];
					ar[j]=temp; 					
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		System.out.println("Second largest element is : "+ar[ar.length-2]);
		System.out.println("Second smallest element is : "+ar[1]);
	}
}
