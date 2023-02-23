package day2.five;


public class CountObjects {
	static int count;
	public CountObjects()
	{
		count++;
	}
     public static void main(String[] args) {
      CountObjects q1=new CountObjects();
      CountObjects q2=new CountObjects();
      CountObjects q3=new CountObjects();
      CountObjects q4=new CountObjects();
      CountObjects q5=new CountObjects();
      System.out.println(CountObjects.count);
 
        	
}
}
