package Exception_handlingExplicit;

public class ExplicitException {

	public static void main(String[] args) throws  userAlreadyExistsException
	{
		
		String str ="yogesh";
		if(str.equals("yogesh")) 
		{
			throw new userAlreadyExistsException("enter valid username");
		}
	}

}
