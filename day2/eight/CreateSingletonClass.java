package day2.eight;


public class CreateSingletonClass {
	public static void main(String[] args) {
		Singleton s= Singleton.SingletonMethod();
		Singleton s1=Singleton.SingletonMethod();
		System.out.println(s.S);
		System.out.println("HashCode: "+s.hashCode());
		System.out.println(s1.S);
		System.out.println("HashCode: "+s1.hashCode());
				
	}
   }

class Singleton
{
	 private static Singleton single_instance=null;
     public String S;
     private Singleton()
    {
      S="Singleton class created";
     }
  public static Singleton SingletonMethod()
  {
      if(single_instance==null)
          single_instance=new Singleton();
      return single_instance;
  }

}
