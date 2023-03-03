package strategypattern;

public class Train extends ModeOfTransport{
 
	//overrides printTime method of ModeOfTransport
	@Override
	void printTime() {
		System.out.println("It takes 20 minutes to reach office if you catch a train");
		
	}

}
