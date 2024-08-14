package com.bsl.iopackages;

public class A {

	public void m1(int x, int y) throws KaniExp {
	
			if(x>y) {
				System.out.println("x is greater than y");
			}
			else {
				throw new KaniExp();
			}
		
	}
}
