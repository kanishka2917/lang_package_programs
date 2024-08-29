package com.tulesko;

import java.io.IOException;
import java.io.InputStreamReader;

public class DemoExceptionFour {

	public static void main(String[] args) {

		int i, j = 1, k = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		i = 8;
		try {
			System.out.println("enter a number : ");
			j = Integer.parseInt(br.readLine());
			k = i / j;
			System.out.println("output is " + k);
			System.out.println("done");

		}

		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero" + e);
		} catch (Exception e) {
			System.out.println("some unknown error");
		}
	}

}
