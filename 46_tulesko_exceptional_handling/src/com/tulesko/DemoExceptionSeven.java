package com.tulesko;

public class DemoExceptionSeven {
	public static void main(String[] args) {
		
		int i = 5;
		try {
			if(i < 10) {
				throw new Exception();
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	

}

class MyException extends DemoExceptionSeven{
	public MyException (String msg) {
		 super();
	}
}

