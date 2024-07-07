package com.bls;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		if (s1 == s2) {
			System.out.println("they are equal");
		} else {
			System.out.println("not equal");
		}
		if (s1.equals(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		String s3 = "hai";
		String s4 = "hai";
		if (s3.equals(s4)) {
			System.out.println("inside 3rd if block");

		}
	}
}
