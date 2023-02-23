package day1.twentyfive;

public class  IllegalModifier{

}
protected class Base        //Illegal modifier for class
{
	String Method()
	{
		return "Wow";
	}
	
}
class Derives
{
	public void useD()
	{
		Base z=new Base();
		System.out.println("base says, "+ z.Method());
	}
}
