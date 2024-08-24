package com.bsl.NumberFormatException;

public class NFE {

	public static void main(String[] args) {
		
		String str = "123";
		try {
		int a = Integer.parseInt(str);
		System.out.println(a);
		}
		
		catch (NumberFormatException n) {
			System.out.println("String "+str+" cannot be converted to integer");
		}
		System.out.println("main method ended");
	}

}
