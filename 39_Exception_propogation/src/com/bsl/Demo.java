package com.bsl;

public class Demo {

	public static void main(String[] args) {
		try {
			m1();
		} catch (ArithmeticException a) {
			System.out.println("exceptional handeled by main method..");
		}
	}

	public static void m1() {

		m2();
	}

	public static void m2() {
		System.out.println(10 / 0);
	}
}
