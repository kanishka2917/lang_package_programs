package com.bsl;

public class Handling {

	public static void main(String[] args) {
		try
		{
			System.out.println("learning coding");
			int a = 20, b = 0, c;
			c = a / b;
			System.out.println(c);
			System.out.println("hello");
		}
		catch(ArithmeticException a) {
			System.out.println("cannot divide by zero");
		}
		finally {
			System.out.println("im finally");
		}
		System.out.println("main method ended");
	}

}
