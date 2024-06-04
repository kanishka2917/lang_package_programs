package p1;

public class DemoOne {
	public static void main(String args[]) {
		
		Hello hello = null;
		hello = new HelloImpl();
		hello.m1();
		int res = hello.add(10, 20);
		System.out.println("sum of both no is " + res);
	}
}
