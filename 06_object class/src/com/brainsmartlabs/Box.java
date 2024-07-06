package com.brainsmartlabs;

public class Box {
	int w, h, d;

	public Box(int w, int h, int d) {
		super();
		this.w = w;
		this.h = h;
		this.d = d;
	}

	int vol() {

		return w * h * d;
	}

}
