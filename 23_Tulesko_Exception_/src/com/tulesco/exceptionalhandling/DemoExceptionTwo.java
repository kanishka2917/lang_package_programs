package com.tulesco.exceptionalhandling;

public class DemoExceptionTwo {

	private static int[] a;

	public static void main(String[] args) {

		int i, j, k = 0;
		i = 8;
		j = 2;
		try {
			k = i / j;
			for (int c = 0; c <= 4; c++) {
				a[c] = c + 1;
			}
			for (int value : a) {
				System.out.println(value);
			}
		} catch (Exception e) {
			System.out.println("cannot divide by zero"+e);
		}
		System.out.println(k);

	}

}
