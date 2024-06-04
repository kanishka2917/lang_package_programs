package p1;

public class BoxWeight extends Box{

	int weight;

	public BoxWeight(int width, int height, int depth, int weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	void m2() {
		System.out.println(weight);
	}
}