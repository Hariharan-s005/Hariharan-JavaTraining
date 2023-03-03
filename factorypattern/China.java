package factorypattern;


//class that extends the Country class
public class China extends Country{
  
	//overrides the capital method of Country class
	@Override
	void capital() {
		System.out.println("Beijing");
		
	}
	//overrides the currency method of Country class
	@Override
	void currency() {
		System.out.println("Yuan");
		
	}
	
}
