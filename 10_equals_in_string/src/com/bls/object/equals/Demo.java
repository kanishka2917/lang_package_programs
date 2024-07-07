package com.bls.object.equals;

public class Demo {
	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hii";
		String s3 = "Hello";
		String s4 = "hii";

		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s2));// false
		System.out.println(s2.equals(s4));// false
		System.out.println(s2.equals(s2));// true
	}
}
