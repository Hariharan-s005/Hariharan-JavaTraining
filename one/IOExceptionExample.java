package one;

import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

public class IOExceptionExample {
	public static void main(String[] args) throws Exception{
		ExceptionExample exceptionExample=new ExceptionExample();
        exceptionExample.method("IO Exception example.txt");  
	}
  }
class ExceptionExample
{
	  void method(String S) throws Exception
	   {   
		FileReader f=new FileReader(S);	  
	   }

}