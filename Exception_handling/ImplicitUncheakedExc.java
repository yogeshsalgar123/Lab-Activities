package Exception_handling;

public class ImplicitUncheakedExc {
	
	public static void main(String[] args) {
	
		//implicit
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
		try {
			String str= "Yogesh";
			System.out.println(str.charAt(6));
		}
		catch(Exception e)
		{
			System.out.println("please enter index less than 6");
		}
		
		
	}

}
