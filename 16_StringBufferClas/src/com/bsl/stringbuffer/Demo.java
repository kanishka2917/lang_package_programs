package com.bsl.stringbuffer;

public class Demo {

	public static void main(String[] args) {
		//method one
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("hello");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("world");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("cluster");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		
	}

}
