package com.bsl.object.equals;

public class Str {
	String str;
	int length;

	public Str(String str) {
		super();
		this.str = str;
		this.length = str.length();
	}
	
	@Override
	public String toString() {
		return str;
	}
	
	//Overrinding Equals Method
	public boolean equals(Object e) {
		boolean res = true;
		
		if(e instanceof Str) {
			Str s = (Str) e;
			if(s.length != this.length) {
				return false;
			}
			
			char [] c1 = s.str.toCharArray();
			char [] c2 = this.str.toCharArray();

			for(int i = 0; i < c1.length; i++) {
				if(c1[i] == c2[i]) {
					continue;
				} else {
					res = false;
					return res;
				}
			}
			return res;
			
		} else {
			System.out.println("Please pass the right object of Str");
			return false;
		}
	}
	

}
