package Exception_handlingExplicit;

public class userAlreadyExistsException extends RuntimeException {

	public userAlreadyExistsException(String string) {
		super(string);
		System.out.println("inside exception class");
	}

	
}
