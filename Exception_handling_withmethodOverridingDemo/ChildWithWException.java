package Exception_handling_withmethodOverridingDemo;

public class ChildWithWException extends SuperWithException {

	
	void division(int p, int q) throws ArithmeticException
	{
		double d= p/q;
	}
	
	
	public static void main(String[] args) {
		ChildWithWException child = new ChildWithWException();
		try {
		child.division(10, 0);
		System.out.println(child);
		}
		catch(ArithmeticException e){
			System.out.println("given number can not be devided by zero");
		}
		finally {
			System.out.println("thanks !  have a nice day");
		}
	}
}



