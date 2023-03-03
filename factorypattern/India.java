package factorypattern;

//class that extends the Country class
public class India extends Country{

	//overrides the capital method of Country class
	@Override
	void capital() {
		System.out.println("New Delhi");
		
	}
	//overrides the currency method of Country class
	@Override
	void currency() {
		System.out.println("Ruppees");
		
	}

}
