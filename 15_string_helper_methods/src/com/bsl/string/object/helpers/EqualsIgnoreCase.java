package com.bsl.string.object.helpers;

public class EqualsIgnoreCase {

	public static void main(String[] args) {

		String s11 = new String("hello");
		String s12 = new String("Hello");
		System.out.println("checking ignoring case : " + s11.equalsIgnoreCase(s12));

	}

}
