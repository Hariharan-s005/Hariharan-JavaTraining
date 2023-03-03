package strategypattern;

//class TwoWheeler which extends ModeOfTransport class
public class TwoWheeler extends ModeOfTransport{
	
	//overrides printTime method of ModeOfTransport
	@Override
	void printTime() {
		System.out.println("It takes 50 minutes to reach office if you come by bike");
		
	}
}
