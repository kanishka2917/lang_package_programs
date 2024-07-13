package com.bsl.wrapperclasses;

public class DemoOne {

	public static void main(String[] args) {
		
		int i = 10;
		Integer x = new Integer(i);
		System.out.println(i);
		System.out.println(x);
		int j = 20;
		Integer y = new Integer(j);
		System.out.println(j);
		System.out.println(y);
		if (i == x) {
			System.out.println("equal");	
		}
		else {
			System.out.println("not equal");
		}
		if(x.equals(y)) {
			System.out.println("inside equals");
		}
		else {
			System.out.println("inside not equals");
		}
	}

}
