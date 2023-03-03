package factorypattern;

public class CountryFactory {

	//method that creates objects for the subclasses
public static Country getInstance(String countryName) {
	
	switch(countryName)
	{
	 case "India":
		 return new India();
       
	 case "Japan":
		 return new India();
    
	 case "USA":
		 return new India();
       
	 case "China":
		 return new India();
      
       default:
    	   System.out.println("No details available");
    	   System.exit(0);
	}
	return null;
	
}
}
