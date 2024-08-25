package com.bsl.throwsandthrow;

public class Test {

	void div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.div(20, 0);
	}

}
