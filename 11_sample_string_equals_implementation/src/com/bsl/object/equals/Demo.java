package com.bsl.object.equals;

public class Demo {
	public static void main(String[] args) {
		

		Str s1 = new Str("Hello");
		Str s2 = new Str("Haii");
		Str s3 = new Str("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
