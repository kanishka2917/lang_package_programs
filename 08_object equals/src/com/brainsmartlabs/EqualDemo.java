package com.brainsmartlabs;

public class EqualDemo {
	public static void main(String[] args) {
		Test t1 = new Test(10, 20);
		Test t2 = new Test(10, 20);
		Test t3 = new Test(5, 5);
		if (t1 == t2) {
			System.out.println("both object address are equal");
		}
		else {
			System.out.println("both object address are not equal");
		}
	}
}
