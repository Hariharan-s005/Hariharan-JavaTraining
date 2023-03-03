package flyweightpattern;

import java.util.HashMap;
import java.util.Map;

 class EmployeeDatabase {
	 
    private Map<String,Employee> employees = new HashMap<>();     //Hashmap which stores the employeename and employeeRole
    
    //method to assign and display Employee details
    public void displayRole(String employeeName, String employeeRole) {
    	
    	Employee employee=employees.get(employeeName);   //gets employee object if presemt in map
       
        if(employee==null) {
        	employee=new Employee(employeeName,employeeRole);    //if employee details does not exist adds details to map
            employees.put(employeeName,employee);
        }
        employee.print();   //calls print() method which prints the values
    }
}