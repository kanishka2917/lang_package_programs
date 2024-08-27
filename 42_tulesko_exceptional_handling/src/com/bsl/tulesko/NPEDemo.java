package com.bsl.tulesko;

public class NPEDemo {
	
	String str = "123";
	try
	{
		int a = Integer.parseInt(str);
		System.out.println(a);
	}

	catch(
	NumberFormatException n)
	{
		System.out.println("String " + str + " cannot be converted to integer");
	}System.out.println("main method ended");
}

}

