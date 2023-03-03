/**
 * This program demonstrates Flyweight pattern
 *  @author Hariharan Shakthivel 
 */
package flyweightpattern;

public class FlyWeightPattern {
    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();  //creates object of EmployeeDatabase
        
        employeeDatabase.displayRole("Raj", "Manager");
        employeeDatabase.displayRole("Rakesh", "Consultant");
        employeeDatabase.displayRole("Raj", "Manager");
        employeeDatabase.displayRole("Rakesh", "Consultant");
    }
}