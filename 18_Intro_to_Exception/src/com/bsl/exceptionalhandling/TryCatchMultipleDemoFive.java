package com.bsl.exceptionalhandling;

public class TryCatchMultipleDemoFive {

	public static void main(String[] args) {
		
		try {
			int x = 10;
			int y = 2;
			int z = 0;
			z = x / y;
			System.out.println("result of div is :" + z);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("inside catch of exception");
			e.printStackTrace();
		}
		System.out.println("end main");
	}

}
