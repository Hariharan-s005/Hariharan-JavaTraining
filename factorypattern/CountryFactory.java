package factorypattern;

public class CountryFactory {
public static Country getInstance(String countryName) {
	if(countryName.equals("India"))
	    return new India();
   else if(countryName.equals("Japan"))
	    return new Japan();
   else if(countryName.equals("USA"))
	    return new USA();
   else if(countryName.equals("China"))
	    return new China();
	
	return null;
}
}
