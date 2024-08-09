package com.bsl.exceptionalhandling;

public class TryCatchDemoFour {

	public static void main(String[] args) {
		
		System.out.println("begin");
		try {
			System.out.println("begin try");
			int a[] = new int[5];
			a[3] = 109;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("end main");
	}
}
