package factorypattern;

public class USA extends Country{

	@Override
	void capital() {
		System.out.println("Washington DC");
		
	}

	@Override
	void currency() {
		System.out.println("Dollar");
		
	}
}
