package com.tulesko;

public class DemoExceptionThree {

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
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("maximum number of vslues is 4");
		} catch (Exception e) {
			System.out.println("some unknown error");
		}
		System.out.println(k);

	}

}
