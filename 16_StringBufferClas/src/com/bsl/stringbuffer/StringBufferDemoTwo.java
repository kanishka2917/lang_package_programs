package com.bsl.stringbuffer;

public class StringBufferDemoTwo {

	public static void main(String[] args) {

		StringBuffer sb2 = new StringBuffer("hello");
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb2 & sb3 are equal " + (sb2 == sb3));
		System.out.println("sb2 & sb3 are equal " + (sb2.equals(sb3)));
		String s1 = sb2.toString();
		String s2 = sb3.toString();
		System.out.println("s1 and s2 are equal " + s1.equals(s2));
		System.out.println((s1 == s2));

	}

}
