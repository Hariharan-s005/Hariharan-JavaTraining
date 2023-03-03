/**
 * This program demonstrates Builder pattern
 *  @author Hariharan Shakthivel 
 */
package builderpattern;

public class EmployeeBuilder {
	    public static void main(String args[])
	    {  
	    	//creating three employee objects
	    	Employee employee1=new Employee();  
	    	Employee employee2=new Employee();
	    	Employee employee3=new Employee();
	    	
	    	//setting id,name and address
	    	employee1.setId(1).setName("Mukund").setAddress("Bangalore");
	    	employee2.setId(2).setName("Rahul").setAddress("Delhi");
	    	employee3.setId(3).setName("James").setAddress("USA");
	       
	    	
	    	//printing employee details
	    	System.out.println("ID NAME   ADDRESS");
	        System.out.println(employee1.id+" "+employee1.name+" "+employee1.address);
	        System.out.println(employee2.id+" "+employee2.name+" "+employee2.address);
	        System.out.println(employee3.id+" "+employee3.name+" "+employee3.address);
	    }
	}
