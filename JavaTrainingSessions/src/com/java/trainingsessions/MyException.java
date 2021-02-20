package com.java.trainingsessions;



public class MyException {

	//	public void test(boolean condition) {
	//		if(condition==true) {
	//			System.out.println("Test Passed");
	//		}
	//		else {
	//			System.out.println("Test Failed");
	//		}
	//		return;
	//	}
	//
	//	public void newException() {
	//		try {
	//
	//		}
	//		catch (Exception e) {
	//			// TODO: handle exception
	//		}
	//
	//		class Candidate{
	//
	//		}
	//	}
	public static void main(String[] args) throws ArithmeticException {

		//		System.out.println("Test Started");
		//		System.out.println("\n Can overthrow");

		try {
			int a =1/0;
		}
		catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
