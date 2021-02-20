package com.java.trainingsessions;

public class ThrowKeyword {
	public void maths() {
		try {
			int i=9/0;
			//throw new Exception("MyException");
			throw new ArithmeticException("Ari");
		}

		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("New Exception");
		}

		finally {
			System.out.println("this is finally and should be exceuted whether an exception handled or not");
		}
		
	}
	public static void main(String[] args) {
		ThrowKeyword tk = new ThrowKeyword();
		tk.maths();
	}
}
