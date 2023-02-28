package six;

/*class responsible for counting the characters.*/
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
/* creates  a custom exception class that throws  an exception if a non alphabetic character is entered.*/
class NotAnAlphabetException extends Exception
{
  
	  public NotAnAlphabetException(String s) {
	   super(s);
  }
	 
}
