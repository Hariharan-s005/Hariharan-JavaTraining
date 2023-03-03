package strategypattern;

//class Bus that extends modeOfTransport class
public class Bus  extends ModeOfTransport{
	
	//overrides printTime method of ModeOfTransport class
	@Override
	void printTime() {
		System.out.println("It takes 35 minutes to reach office if you catch a bus");
		
	}
}
