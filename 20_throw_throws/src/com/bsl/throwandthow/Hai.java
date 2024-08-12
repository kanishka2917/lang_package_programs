package com.bsl.throwandthow;

public class Hai {
	void m1(int x, int y) {
		int z = 0;
		z = x/y;
		int p = 0;
		try {
			if(x==0&&y==0) {
				throw new ArithmeticException();
							}
			else {
				p = x / y;
		}
	}
	finally{
		System.out.println("im finally");
	}
	}
}
