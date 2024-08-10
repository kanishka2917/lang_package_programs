package com.bsl.exceptionalhandling;

public class Fun {
	
	int m1(int x, int y) {
		int z = 0;
		try {
			System.out.println("begin try");
			z = x / y;
			return z;
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch");
			return z;
		}
		finally {
			System.out.println("inside finally");
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
	}
}
