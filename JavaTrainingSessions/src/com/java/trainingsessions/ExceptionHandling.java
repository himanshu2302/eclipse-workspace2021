package com.java.trainingsessions;

public class ExceptionHandling {

	public void maths() throws ArithmeticException {
		int i=9/0;
		System.out.println("This is maths method");
	}
	public static void main(String[] args) throws ArithmeticException {
		ExceptionHandling ec = new ExceptionHandling();
		ec.maths();


	}
}
