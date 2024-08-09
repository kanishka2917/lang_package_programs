package com.bsl.exceptionalhandling;

public class ExceptionDemoOne {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		int z = 0;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		z = x / y;//Arithemetic exception
		System.out.println("end of main");
		
	}

}
