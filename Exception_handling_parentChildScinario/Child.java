package Exception_handling_parentChildScinario;

public class Child extends Parent {

	void display() throws ArithmeticException
	{
		System.out.println("inside child class");
	}
	
	public static void main(String[] args) {
		Parent p = new Child();
		p.display();
	}
}
