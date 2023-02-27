package six;
public class CharacterRunner {

	 static int count=0;
	  public static void check(char c) throws NotAnAlphabetException {
	  

	    if (Character.isLetter(c)) {
	      count++;
	    }
	    else {
	      throw new NotAnAlphabetException(c + " is not a letter"); 
	    }
	    
	  }
}

class NotAnAlphabetException extends Exception
{
  
	  public NotAnAlphabetException(String s) {
	   super(s);
  }
	 
}
