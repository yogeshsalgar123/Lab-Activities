package Exception_handling_withmethodOverridingDemo;

public class TestExceptionChild extends TestExceptionParent{

	void display() 
	{
		System.out.println("child method");
	}

	public static void main(String args[]) {
		TestExceptionParent p = new TestExceptionParent();

		try {
			p.display();
		} catch (Exception e) {
		}

	}
}
