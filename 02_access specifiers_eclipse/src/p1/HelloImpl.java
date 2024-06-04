package p1;

public class HelloImpl implements Hello {
	
	public void m1() {
		System.out.println("inside m1");
	}
	
	public int add(int x, int y){
		
		int z = 0;
		z = x + y;
		return z;
	}
}
