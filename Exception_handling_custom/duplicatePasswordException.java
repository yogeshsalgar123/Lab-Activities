package Exception_handling_custom;

public class duplicatePasswordException extends RuntimeException {

	public duplicatePasswordException(String str) {
		super(str);
	}
}
