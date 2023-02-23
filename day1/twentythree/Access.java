package day1.twentythree;



public class Access {
	public static void main(String[] args){
		Manipulate.manipulate();
		System.out.println(Protect.S);
		
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
