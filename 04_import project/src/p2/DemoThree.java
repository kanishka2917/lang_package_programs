package p2;

import p1.Box;

public class DemoThree {
	
	public static void main (String args[]) {
		
		p1.Box box1 = new Box(1,2,3);
		System.out.println(box1.width);
		int vol1 = box1.volume();
		System.out.println(vol1);
		p1.Box box2 = new Box(4,5,6);
		box1 = new Box(7,8,9);
		
	}

}
