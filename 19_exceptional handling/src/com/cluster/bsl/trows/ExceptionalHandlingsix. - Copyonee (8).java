package com.bsl.wrapper.classes.demos;

public class WrapperDemoTwo {

	public static void main(String[] args) {
		
		int i = 999;
		Integer z = new Integer(i);
		byte b = z.byteValue();
		short s = z.shortValue();
		long l = z.longValue();
		float f = z.floatValue();
		double d = z.doubleValue();
		System.out.println(b);
		System.out.println(l);
		System.out.println(d);
		System.out.println(s);
		System.out.println(f);
	}

}