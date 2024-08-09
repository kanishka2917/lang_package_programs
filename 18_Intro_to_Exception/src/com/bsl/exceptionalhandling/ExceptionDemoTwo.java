package com.bsl.exceptionalhandling;

public class ExceptionDemoTwo {

	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 0;
			int z = 0;
			z = x / y;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("After catch block");
	}
}
