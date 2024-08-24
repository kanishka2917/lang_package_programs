package com.bsl.multiplecatch;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int a = 10, b = 2, c;
			c = a / b;
			System.out.println(c);

			int arr[] = { 10, 20, 30 };
			System.out.println(arr[0]);

			String str = null;
			System.out.println(str.toUpperCase());
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("array exception");
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exception");
		} catch (NumberFormatException n) {
			System.out.println("number exception");
		} catch (Exception x) {
			System.out.println("all type exception handled");
		}
	}
}
