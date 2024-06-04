package p1;

public class Shipment extends BoxWeight {
	
	int cost;	
	
	public Shipment(int width, int height, int depth, int weight, int cost) {
	super(width, height, depth, weight);
	this.cost = cost;
	}
	
	void m3() {
		System.out.println("value of cost is " + cost);
	}
}