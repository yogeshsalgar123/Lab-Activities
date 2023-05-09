package Question13;

public class Rectangle extends Shape {

	private int length;
	private int breadth;
	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	protected float calculateArea() {
		System.out.println(length*breadth);
		return length*breadth;
	}
	
	
	
}
