package com.bsl.stringbuffer;

public class DemoTwo {

	public static void main(String[] args) {

		// method two
		StringBuffer sb2 = new StringBuffer(30);// any value
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		sb2.append("hello");
		System.out.println(sb2);

	}

}
