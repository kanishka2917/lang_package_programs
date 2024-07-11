package com.bsl.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("hello");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("1234");
		System.out.println(sb1);
		sb1.replace(2, 4, "cluster");
		System.out.println("after replacing"+sb1);
		sb1.delete(3, 6);
		System.out.println(sb1);
		sb1.insert(5, "a");
		System.out.println("after inserting"+sb1);
		sb1.reverse();
		System.out.println(sb1);

	}

}
