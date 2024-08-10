package com.bsl.exceptionalhandling;

public class Test {
	
	void m1(int x, int y) {
		System.out.println("begin m1");
		try {
			System.out.println("inside try");
			int z = x / y;
			System.out.println("result of div is " + z);
		}
		catch(ArithmeticException e){
			System.out.println("inside catch" + e);
		}
	}

}
