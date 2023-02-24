package five;

public class ExceptionExampleMethod {
  public static void main(String[] args) throws Exception {
	 
			try {
				throw new OwnException("Own Exception example");
				}
			
	}
}
class OwnException extends Exception {
	String message;
	OwnException(String message) {   
		this.message=message;
		}
	public String toString() {
		return message;
	}
}


			