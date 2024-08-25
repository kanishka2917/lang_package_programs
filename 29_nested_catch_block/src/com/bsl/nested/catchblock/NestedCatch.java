package com.bsl.nested.catchblock;

public class NestedCatch {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 2);
		} catch (Exception e) {
			System.out.println(e);
			try {
				String a = "ANU";
				System.out.println(a.toLowerCase());
			} catch (NullPointerException n) {
				System.err.println("null value cant be converted");
			}
		}

		System.out.println("main method ended");
	}

}
