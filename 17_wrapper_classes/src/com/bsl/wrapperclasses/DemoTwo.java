package com.bsl.wrapperclasses;

public class DemoTwo {
	public static void main(String[] args) {
		int i = 10;
		Integer x = new Integer(i);
		System.out.println(i);
		System.out.println(x);
		int j = 20;
		Integer y = new Integer(j);
		System.out.println(j);
		System.out.println(y);
		if (i > j) {
			System.out.println("i greater than j");
		} else if (i < j) {
			System.out.println("i less than j");
		} else {
			System.out.println("both are equal");
		}
	}
}
