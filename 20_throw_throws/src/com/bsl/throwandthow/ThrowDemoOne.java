package com.bsl.throwandthow;

public class ThrowDemoOne {

	public static void main(String[] args) {
		
		Hai h = new Hai();
		try {
			h.m1(10, 0);
			System.out.println("end try");
		}
		catch(ArithmeticException e) {
			h.m1(10, 2);
		}
	}

}
