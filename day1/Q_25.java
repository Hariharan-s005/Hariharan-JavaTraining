package day1;

public class Q_25 {

}
protected class base        //Illegal modifier for class
{
	String Method()
	{
		return "Wow";
	}
	
}
class derives
{
	public void useD()
	{
		base z=new base();
		System.out.println("base says, "+ z.Method());
	}
}
