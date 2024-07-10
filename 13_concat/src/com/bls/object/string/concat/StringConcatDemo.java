package com.bls.object.string.concat;

public class StringConcatDemo {
	
	public static void main(String[] args) {
		
		String s1 = "a";
		String s2 = s1.concat("b");
		System.out.println(s1);
		System.out.println(s2);
		s1 = s1.concat("c");
		System.out.println(s1);		
	}

}
