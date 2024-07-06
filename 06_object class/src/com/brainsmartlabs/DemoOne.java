package com.brainsmartlabs;

public class DemoOne {
	public static void main(String[] args) {
		Box b1 = new Box(1, 2, 3);
		Test t1 = new Test(5, 6);
		Box b2 = new Box(7, 8, 9);
		Test t2 = new Test(10, 10);
		Class c1 = b1.getClass();
		Class c2 = b2.getClass();
		Class c3 = t1.getClass();
		Class c4 = t2.getClass();
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(c4);
	
	}

}
