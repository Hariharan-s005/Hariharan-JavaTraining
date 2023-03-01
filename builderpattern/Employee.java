package builderpattern;

public class Employee {
	    public int id;
	    public String name;
	    public String address;
	 
	    public Employee setId(int id)
	    {
	        this.id = id;
	        return this;
	    }
	    public Employee setName(String name)
	    {
	        this.name = name;
	        return this;
	    }	 
	    public Employee setAddress(String address)
	    {
	        this.address = address;
	        return this;
	    }
	    
   }
	