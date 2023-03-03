package factorypattern;

//class that extends the Country class
public class Japan extends Country{
	
	//overrides the capital method of Country class
	@Override
	void capital() {
		System.out.println("Tokyo");
		
	}
	//overrides the currency method of Country class
	@Override
	void currency() {
		System.out.println("Yen");
		
	}
}
