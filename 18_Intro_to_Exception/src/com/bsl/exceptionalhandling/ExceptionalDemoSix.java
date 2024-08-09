
package com.bsl.exceptionalhandling;

public class ExceptionalDemoSix {
			
		void m1(int x, int y)
		{
			try
			{
				int z = 0;
				z = x / y;
				System.out.println("result of div is " + x);
			}
			catch(ArithmeticException e)
			{
				System.out.println("please give correct value");
				int p = 10;
				int q = 2;
				int r = p / 2;
				System.out.println("end of m1");
			}
	}
}
