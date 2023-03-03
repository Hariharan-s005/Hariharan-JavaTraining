package flyweightpattern;

class Employee{
    private String employeeName;
    private String employeeRole;
    
    //constructor which assigns values
    public Employee(String employeeName, String employeeRole) {
        this.employeeName=employeeName;
        this.employeeRole=employeeRole;
    }  
    //a method that prints the employeeName and employeeRole
    public void print() {
        System.out.println("Employeee Name: "+employeeName+", Role: "+employeeRole);
    }
}
