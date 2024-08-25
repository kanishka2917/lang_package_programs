package com.bsl.nestedtryblock;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				int a[]= {10,20,30};
				System.out.println(a[23333]);
			}
			catch (ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
			}
			System.err.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("end of main");
	}

}
