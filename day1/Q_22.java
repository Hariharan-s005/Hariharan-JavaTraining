package day1;

public class Q_22 {
	public static void main(String[] args) {
	Access access=new Access();
 System.out.println(access.a);
 System.out.println(access.b); /** We get the following error: Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	                           The field Access.b is not visible**/
 System.out.println(access.c);
 System.out.println(access.d);
 
 access.pub();
 access.priv();  /**We get the following error: Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	                The method priv() from the type Access is not visible**/
 access.protect();
 access.def();
 }
   }
class Access
{  
	 public String a="Public data member";
	    private String b="Private data member";
	    protected String c="Protected data member";
	    String d="Default data member";
	    
	    public void pub()
	    {
	    	System.out.println("Public method");
	    }
	    private void priv()
	    {
	    	System.out.println("Private method");
	    }
	    protected void protect()
	    {
	    	System.out.println("Protected method");
	    }
	    void def()
	    {
	    	System.out.println("Default method");
	    }

	
    }


