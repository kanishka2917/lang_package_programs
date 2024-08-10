package com.bsl.exceptionalhandling;

public class FinallyDemoOne {
	
	public static void main(String[] args) {
		
		System.out.println("begin main");
		int x = 10;
		int y = 2;
		int z = 0;
		try {
			System.out.println("begin try");
			z = x / y;
			System.out.println("result of div is " + z);
			System.out.println("end try");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("i'm finally");
		}
		System.out.println("end main");
	}
}
