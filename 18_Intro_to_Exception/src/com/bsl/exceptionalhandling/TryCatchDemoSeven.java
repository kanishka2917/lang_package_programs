package com.bsl.exceptionalhandling;

public class TryCatchDemoSeven {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		ExceptionalDemoSix h = new ExceptionalDemoSix();
		try {
			h.m1(a, b);
		} catch (ArithmeticException e) {
			int p = 10;
			int q = 2;
			h.m1(p, q);
		}
	}
}
