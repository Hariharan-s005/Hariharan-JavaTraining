package factorypattern;

public class Japan extends Country{
	
	@Override
	void capital() {
		System.out.println("Tokyo");
		
	}

	@Override
	void currency() {
		System.out.println("Yen");
		
	}
}
