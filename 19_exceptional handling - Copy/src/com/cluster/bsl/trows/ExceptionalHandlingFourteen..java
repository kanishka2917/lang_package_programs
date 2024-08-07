package com.bsl.wrapper.classes.demos;

public class WrapperDemoOne {

	public static void main(String[] args) {

		int i = 10;
		Integer x = new Integer(i);
		Integer p = Integer.valueOf(i);
		System.out.println(i);
		System.out.println(x);
		System.out.println(p);
		double d = 99.99;
		double y = new Double(d);
		double q = Double.valueOf(d);
		System.out.println(d);
		System.out.println(y);
		System.out.println(q);
		boolean b = true;
		boolean z = new Boolean(b);
		boolean r = Boolean.valueOf(b);

	}

}
