package one;

import java.io.IOException;
import java.io.UncheckedIOException;

public class IOExceptionExample {
	public static void main(String[] args){
         throw new UncheckedIOException(null);
	}
  }
class ExceptionExample
{
	 public static void method() throws Exception
	   {   
		
		   throw new IOException();
	   }

}