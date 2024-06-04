package p1;

public class DemoTwo {
	public static void main(String args[]) {
		Box box = new Box(1,2,3);
		int v = box.volume();
		box.m1();
		System.out.println(v);
		System.out.println(box.width);
		System.out.println(box.height);
		System.out.println(box.depth);
	}
}
