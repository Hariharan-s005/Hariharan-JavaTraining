package builderpattern;


//a class that has employee id,name, address as properties and setters to set the properties
public class Employee {
	    public int id;
	    public String name;
	    public String address;
	 
	    //sets id
	    public Employee setId(int id)
	    {
	        this.id = id;
	        return this;
	    }
	    //sets name
	    public Employee setName(String name)
	    {
	        this.name = name;
	        return this;
	    }	 
	    //sets address
	    public Employee setAddress(String address)
	    {
	        this.address = address;
	        return this;
	    }	    
   }
	