package com.bsl.nestedfinally;

public class NestedFinally {

	public static void main(String[] args) {

		try {
			String a = "anu";
			System.out.println(a.toUpperCase());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				System.out.println(10 / 2);
			} catch (ArithmeticException a) {
				System.out.println(a);
			} finally {
				System.out.println("im nested finally");
			}
		}
		System.out.println("main method ended");
	}

}
