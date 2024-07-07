package com.bsl.object.tostring;

public class Hello {

	int i, j;

	public Hello(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	// overriding to string method
	@Override
	public String toString() {

		String s1 = "value of i and j is " + i + " & " + j ;
		return s1;

	}

}
