package five;

public class ExceptionExampleMethod {
  public static void main(String[] args) throws OwnException {
	throw new OwnException("Own Exception example");		
	}
}
class OwnException extends Exception {
	String message;
	OwnException(String message) {   
		super(message);	
		}
	
}


			