package com.bsl.nested.catchblock;

public class NestedCatch {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			String a = null;
			System.out.println(a.toLowerCase());
		}
		System.out.println("main method ended");
	}

}
