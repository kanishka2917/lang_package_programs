package com.cluster.bsl.exceptionalhandling;

public class DemoExceptionTwo {

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
		catch(ArrayIndexOutOfBoundException e) {
			System.out.println("maximum number of values is 4");
		}
		System.out.println(k);

	}

}
