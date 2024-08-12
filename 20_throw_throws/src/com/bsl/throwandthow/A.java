package com.bsl.throwandthow;

public class A {

	void m1(int x, int y) {
		System.out.println("begin m1");
		int p = x / y;
		System.out.println(p);
		B b = new B();
		b.m2();
		System.out.println("end m1");
	}
}

class B {
	void m2() {
		System.out.println("begin m2");
		int a[] = new int[5];
		a[9] = 222;
		System.out.println("end m2");
	}
}
