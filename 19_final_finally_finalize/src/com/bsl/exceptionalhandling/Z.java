package com.bsl.exceptionalhandling;

public class Z {

	int m1(int x, int y) {
		int z = 0;
		try {
			System.out.println("begin try");
			z = x/y;
			return z;
		}
		finally {
			System.out.println("inside finally");
		}
	}
}
