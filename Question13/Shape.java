package Question13;

public abstract class Shape {
	protected String name;

	public Shape(String name) {
	
		this.name = name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	protected abstract float calculateArea();

}
