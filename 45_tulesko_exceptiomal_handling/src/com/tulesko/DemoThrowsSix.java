package com.tulesko;

public class  DemoThrowsSix {

	void div(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		DemoThrowsSix t = new DemoThrowsSix();
		try {
			t.div(20, 0);
		} catch (Exception e) {
			System.out.println("the value of b is zero");
		}
	}

}
