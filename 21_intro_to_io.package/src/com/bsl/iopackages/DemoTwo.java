package com.bsl.iopackages;

public class DemoTwo {

	public static void main(String[] args) {
	
		A a = new A();
		try {
			a.m1(7, 8);
		} catch (KaniExp e) {
			System.out.println("Caught Kani Exp");;
		}
		
		B b = new B();
		b.m1(5, 7);
	}
	
	

}
