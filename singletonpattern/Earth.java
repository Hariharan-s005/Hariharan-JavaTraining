package singletonpattern;

public class Earth {
   private Earth()
   {
	   System.out.println("Earth object created");
   }
   private static Earth earth;
   public static Earth createObject()
   {  
	   if(earth==null)
	      earth =new Earth();   
	 return earth;	   
   }
}
