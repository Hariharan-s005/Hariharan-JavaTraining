package strategypattern;

//class Cycle that extends modeOfTransport class
public class Cycle extends ModeOfTransport{
	@Override
	//overrides printTime method of ModeOfTransport
	void printTime() {
		System.out.println("It takes 2 hours to reach office if you office");
		
	}
}
