package com.brainsmartlabs.object.finalize;

public class FinalizeDemo {
	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		a1.m1();
		a2.m1();
		a1.m2();
		a2.m2();
		System.gc();
		a1 = null;
		a2 = null;
		a3 = a4;
		System.gc();

	}

}
