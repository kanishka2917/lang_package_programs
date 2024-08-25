package com.bsl;

import java.util.Iterator;

public class Demo {

	public static void Wait() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);

		}
	}

	public static void main(String[] args) throws InterruptedException {
		Wait();
		System.out.println(10 / 0);
		System.out.println("main method ended");
	}
}
