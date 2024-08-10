package com.bsl.exceptionalhandling;

public class FinallyFixErrorDDemoFour {

	public static void main(String[] args) {

		System.out.println("begin main");
		Z z = null;
		int res = 0;
		try {
			System.out.println("begin try");
			z = new Z();
			res = z.m1(10, 0);
			System.out.println("result of division" + res);
			System.out.println("end try");
		} catch (ArithmeticException e) {
			System.out.println("inside catch");
			res = z.m1(10, 2);
		}
		System.out.println("end main");

	}

}
