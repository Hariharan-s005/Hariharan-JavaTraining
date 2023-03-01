package factorypattern;

public class China extends Country{

	@Override
	void capital() {
		System.out.println("Beijing");
		
	}

	@Override
	void currency() {
		System.out.println("Yuan");
		
	}
	
}
