package com.bsl.stringbuffer;

public class DemoThree {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		if (sb1 == sb2) {
			System.out.println("inside upper if block");

		}
		if (sb1.equals(sb2)) {
			System.out.println("inside lower if block");

		}
	}

}
