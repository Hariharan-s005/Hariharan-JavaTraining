package day1;

public class Q_23 {
	public static void main(String[] args){
		Manipulate manipulate=new Manipulate();
		manipulate.manipulate();
		Protect protect1=new Protect();
		System.out.println(protect1.S);
		
		}
}
class Manipulate extends Protect
{
	public static void manipulate() {
		S=S.replace(S,"The protected String has been manipulated.");
	
	}
}
class Protect
{
	protected static String S="This string is protected.";
}
