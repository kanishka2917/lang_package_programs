package com.brainsmartlabs.object.finalize;

public class A {
	A() {
		System.out.println("initialising resources");
	}
	void m1() {
		System.out.println("using resources in m1()");
		}
	void m2() {
		System.out.println("using resources in m2()");
		}
	public void finalize() {
		System.out.println("clearing the resourse");
	}
}
