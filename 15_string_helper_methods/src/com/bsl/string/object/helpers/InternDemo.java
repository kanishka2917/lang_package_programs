package com.bsl.string.object.helpers;

public class InternDemo {
	public static void main(String[] args) {
		
		String s6 = "world";
		String s7 = new String("world");
		if(s6==s7) {
			System.out.println("s6 and s7 are equal before intern");
		}
		else {	
			System.out.println("s6 and s7 are not equal before intern");
		}
		s7 = s7.intern();
		if(s6==s7) {
			System.out.println("s6 and s7 are equal after intern");

		}
		else{
			System.out.println("s6 and s7 are not equal after intern");
		}
	}
}
