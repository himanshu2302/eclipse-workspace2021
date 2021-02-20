package com.java.trainingsessions;

public class Derived extends BaseClass{

	public Derived() {
		System.out.println("This is derived class constructor");
	}

	public void add(int a, int b) {
		System.out.println("This is derived class add method");
	}

	public void subtract() {
		System.out.println("This is derived class subtract method");
	}

	public void divide() {
		System.out.println("This is derived class divide method");
	}

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakingSystem() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		BaseClass bc = new Derived();
		Derived d = new Derived();



	}


}
