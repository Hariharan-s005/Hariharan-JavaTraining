package six;

public class BaseClass {
	public BaseClass() throws Exception {
		throw new Exception();		
	}
	public static void main(String[] args) throws Exception {
		DerivedClass derivedclass=new DerivedClass();
	}
}

class DerivedClass extends BaseClass {
	public DerivedClass() throws Exception{
	try {
			throw new Exception("Exception");
		}
	catch(Exception e) {
				System.out.println(e);
		}
	}
}

