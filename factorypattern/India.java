package factorypattern;

public class India extends Country{

	@Override
	void capital() {
		System.out.println("New Delhi");
		
	}

	@Override
	void currency() {
		System.out.println("Ruppees");
		
	}

}
