package com.bsl.throwandthow;

public class ThrowDemoOne {

	public static void main(String[] args) {
		
		Hai h = new Hai();
		try {
			int ans = h.m1(30, 0);
			System.out.println(ans);
			System.out.println("Dummy Dummy Dummy");
		}
		catch (ArithmeticException e) {
			System.out.println("Please enter proper numbers");
		}
		finally {
			System.out.println("Thank you come again");
		}
		
	}
}
