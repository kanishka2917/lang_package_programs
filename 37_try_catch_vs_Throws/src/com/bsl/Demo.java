package com.bsl;

import java.util.Iterator;

public class Demo {

	public static void wait() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);

		}
	}

	public static void main(String[] args) {
		wait();
	}
}
