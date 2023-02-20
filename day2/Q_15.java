package day2;
import java.util.*;
public class Q_15 {
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	House house=new House();
    System.out.println("Enter total area of door:");
	house.areaForDoor=scan.nextFloat();
	System.out.println("Enter total area of window:");
	house.areaForWindow=scan.nextFloat();
	System.out.println("Enter cost per square feet for making door:");
	house.door.costPerSqFeet=scan.nextFloat();
	System.out.println("Enter cost per square feet for making window:");
	house.window.costPerSqfeet=scan.nextFloat();
	
	
	
}
}
class House
{
	float areaForDoor;
	float areaForWindow;
	
	Door door=new Door();
	Window window=new Window();

	
	public static float costOfDoor()
	{   
    
		return costperSqFeet*areaForDoor;
	}
	public static float costOfWindow()
	{
			}
	public static float constructingCost()
	{
		return totalCostDoor+totalCostWindow;
	}
}
class Door extends House
{
	float costPerSqFeet;
}
class Window extends House
{
	float costPerSqfeet;
}
