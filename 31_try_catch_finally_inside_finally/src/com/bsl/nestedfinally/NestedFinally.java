package com.bsl.nestedfinally;

public class NestedFinally {

	public static void main(String[] args) {

		try {
			String a = "anu";
			System.out.println(a.toUpperCase());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(10 / 0);
		}
		System.out.println("main method ended");
	}

}
