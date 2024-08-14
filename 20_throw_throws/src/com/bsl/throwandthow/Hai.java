package com.bsl.throwandthow;

public class Hai {
	int m1(int x, int y) throws ArithmeticException{
		int z = 0;
		if(y == 0) {
			System.out.println("inside if y == 0");
			throw new ArithmeticException();
		}
		
		z = x/y;
		System.out.println("Value of z is : " + z);
		return z;
	}
}
