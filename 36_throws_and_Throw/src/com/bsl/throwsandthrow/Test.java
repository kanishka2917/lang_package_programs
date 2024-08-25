package com.bsl.throwsandthrow;

public class Test {

	void div(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.div(20, 0);
		} catch (Exception e) {
			System.out.println("the value of b is zero");
		}
	}

}
