package com.bsl.exceptionalhandling;

public class ExceptionDemoThree {

	public static void main(String[] args) {
		
		System.out.println("Begin main");
		int a[] = new int [5];
		a[9] = 109;//ArrayIndexOutOfBoundException
		System.out.println("end main");
	}

}
