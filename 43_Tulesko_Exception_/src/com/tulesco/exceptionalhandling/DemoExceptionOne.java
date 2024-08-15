package com.tulesco.exceptionalhandling;

public class DemoExceptionOne {

	public static void main(String[] args) {

		int i, j, k = 0;
		i = 8;
		j = 0;
		try {
			k = i / j;
		}
		catch(Exception e) {
			System.out.println("cannot divide by zero");
		}
		System.out.println(k);
	}

}
