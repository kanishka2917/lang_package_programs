package com.bsl.multiple;

public class Handling {

	public static void main(String[] args) {
		// Multiple try catch
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException a) {
			System.out.println("cant divide by zero");
		}
		try {
			int a[] = { 10, 20, 30, 40 };
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException b) {
			System.out.println("beyond the array limit");
		}

		// why do we use multiple try catch
	}

}
