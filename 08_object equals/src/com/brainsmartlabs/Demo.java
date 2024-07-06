package com.brainsmartlabs;

public class Demo {
	
	public static void main(String[] args) {
		Test t1 = new Test(10,20);
		Test t2 = new Test(10,20);
		Test t3 = new Test(5,5);
		
		if(t1.equals(t3)) {
			System.out.println("address is same");	
		}
		else {
			System.out.println("address is not same");
		}

	}
	
	
}
