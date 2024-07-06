package com.brainsmartlabs;

public class Test {

	int x;
	int y;

	Test(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// overriding equals method to define equality condition
	public boolean equals(Object e) {
		boolean b = false;
		if (e instanceof Test) {
			Test z = (Test) e;
			if (z.x == this.x && z.y == this.y) {
				b = true;
				return b;
			} else {
				return b;
			}
		} else {
			System.out.println("sorry pass the correct object");
			return b;
		}
	}
}
