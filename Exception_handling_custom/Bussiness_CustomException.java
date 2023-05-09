package Exception_handling_custom;

public class Bussiness_CustomException
{

	public static void main(String[] args) throws duplicatePasswordException 
	{
		String emp1 ="yogesh";
		String password="12345";
		
		String emp2 ="rohan";
		String password2 ="12345";
		
		if(password2.equals(password) ) 
		{
			throw new duplicatePasswordException("password is repeted");
		}
		System.out.println("outside");
	}

}
