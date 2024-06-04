package p1;

public class Box {
	
	int width;
	int height;
	int depth;
	

	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
 	
	int volume() {
	int z = 0;
	z = width * height * depth;
	return z;
	}

    void m1(){
	System.out.println("value of width is " + width);
	System.out.println("value of heigth is " + height);
	System.out.println("value of depth is " + depth);
    }
	
}

