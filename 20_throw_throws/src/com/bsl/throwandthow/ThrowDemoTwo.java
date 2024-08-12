package com.bsl.throwandthow;

public class ThrowDemoTwo {

	public static void main(String[] args) {

		System.out.println("begin main");
		String s1 = "hello";
		int x = 999;
		try {
			int p = Integer.parseInt(s1);
			System.out.println(p);
		}
		catch(NumberFormatException e) {
			String s2 = "919";
			int p = Integer.parseInt(s2);
			System.out.println(x);
		}
	}

}
