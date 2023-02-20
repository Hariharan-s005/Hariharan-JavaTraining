package day1;

public class Q2 {
    public static void main(String[] args) {
    	PrintDefaultValues print=new PrintDefaultValues();
    	print.print();
    }
    	
   }
class Printer
    {	
            static byte b;
    		static short s;
    		static int i;
    		static long l;
    		static float f;
    		static double d;
    		static boolean bool;
    		static char c;

 static public void printDefaultvalByte()
 {
	 System.out.println("Default Value of Byte is "+b+".");
 }
 static public void printDefaultvalShort()
 {
	 System.out.println("Default Value of Short is "+s+".");
 }
 static public void printDefaultvalInt()
 {
	 System.out.println("Default Value of Int is "+i+".");
 }
 static public void printDefaultvallong()
 {
	 System.out.println("Default Value of Long is "+l+".");
 }
 static public void printDefaultvalFloat()
 {
	 System.out.println("Default Value of Float is "+f+".");
 }
 static public void printDefaultvalDouble()
 {
	 System.out.println("Default Value of Double is "+d+".");
 }
 static public void printDefaultvalBoolean()
 {
	 System.out.println("Default Value of Bool is "+b+".");
 }
 static public void printDefaultvalCharacter()
 {
	 System.out.println("Default Value of Character is "+"'"+c+"'"+".");
 }
}

class PrintDefaultValues extends Printer{
 void print()
 {
	 printDefaultvalByte();
	 printDefaultvalShort();
	 printDefaultvalInt();
	 printDefaultvallong();
	 printDefaultvalFloat();
	 printDefaultvalDouble();
	 printDefaultvalBoolean();
	 printDefaultvalCharacter();

 }
}


