package singletonpattern;

//singleton class Earth
public class Earth {
   private Earth()
   {
	   System.out.println("Earth object created");
   }
   private static Earth earth;
   
   //method responsible for creating object for Earth
   public static Earth createObject()
   {  
	   if(earth==null)
	      earth =new Earth();   
	 return earth;	   
   }
}
