package com.bsl.wrapper.classes.demos;

public class WrapperDemoThree {

	public static void main(String[] args) {
		
		int x = 99;
		String s1 = Integer.toString(x);
		byte b = 10;
		Byte bb = new Byte(b);
		String s2 = bb.toString();
		Short s = 12;
		String s4 = String.valueOf(s);
		double d = 99.99;
		Double dd = new Double (d);
		
		
	}

}
