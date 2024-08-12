package com.bsl.throwandthow;

public class ThrowsDemoOne {

	public static void main(String[] args) {

		System.out.println("begin main");
		try {
			A a = new A();
			a.m1(10, 2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
