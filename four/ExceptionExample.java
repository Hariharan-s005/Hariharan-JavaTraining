package four;


public class ExceptionExample {
public static void main(String[] args) throws Exception {
	try { 
		  throw new OwnException("Own Exception Example");
		}
	catch(OwnException e) {
		    System.out.println(e.getMessage());	
		}
 }
}
class OwnException extends Exception {
	String message;
	OwnException(String message) {
		super(message);
	}
}
