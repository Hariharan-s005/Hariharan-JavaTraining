package day3.two;

import java.util.Scanner;

public class CalculateAreaVolume {
public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the type of figure:");
	  String figure=scan.nextLine();
	  
	  switch(figure.toLowerCase())
	  {
	  case "circle":
		  Circle circle=new Circle();
		  System.out.println("Enter the radius: ");
		  circle.r=scan.nextFloat();
		  circle.calculateArea();
		  break;
	  case "square":
		  Square square=new Square();
		  System.out.println("Enter the side length");
		  square.a=scan.nextFloat();
		  square.calculateArea();
		  break;
	  case "triangle":
		  Triangle triangle=new Triangle();
		  System.out.println("Enter the 1st side:");
		  triangle.a=scan.nextFloat();
		  System.out.println("Enter the 2nd side:");
		  triangle.b=scan.nextFloat();
		  System.out.println("Enter the 3rd side:");
		  triangle.c=scan.nextFloat();
		  triangle.calculateArea();
		  break;
	  case "sphere":
		  Sphere sphere=new Sphere();
		  System.out.println("Enter the radius: ");
		  sphere.r=scan.nextFloat();
		  sphere.calculateArea();
		  sphere.calculateVolume();
		  break;
	  case "cuboid":
		  Cuboid cuboid =new Cuboid();
		  System.out.println("Enter the length:");
		  cuboid.l=scan.nextFloat();
		  System.out.println("Enter the breadth:");
		  cuboid.b=scan.nextFloat();
		  System.out.println("Enter the height:");
		  cuboid.h=scan.nextFloat();
	       cuboid.calculateArea();
	       cuboid.calculateVolume();
	       break;
	   default:
		   System.out.println("Enter correct shape.");
	  }
	 	  
	  scan.close();	  
}
}
interface CalcArea
{
	public void calculateArea();
}
interface CalcVolume
{ 
	public void calculateVolume();
}
class Circle implements CalcArea
{   float r;
	public void calculateArea()
	{
		System.out.println("Area: "+ 3.14*r*r+" cm square");
	}
}
class Square implements CalcArea
{   float a;
	public void calculateArea()
	{
		System.out.println("Area: "+a*a+" cm square");
	}
}
class Triangle implements CalcArea
{   float a, b, c;
	public void calculateArea()
	{  
		float s=(a+b+c)/2;
		System.out.println("Area: "+Math.sqrt(s*(s-a)*(s-b)*(s-c))+" cm square");	
	}
	public void calculateArea(float r) {
		
		
	}
}
class Sphere implements CalcArea,CalcVolume
{   float r;
	public void calculateArea()
	{
		System.out.println("Area: "+3.14*r*r+" cm square");
	}
	public void calculateVolume()
	{
		System.out.println("Volume: "+3.14*1.4*r*r*r+" cm cube");
	}
}
class Cuboid implements CalcArea
{   float l, b,h;
	public void calculateArea()
	{
		System.out.println("Area: "+2*(l*h+l*b+h*b)+" cm square");
	}
	public void calculateVolume() 
	{
		System.out.println("Volume: "+l*b*h+" cm cube");
	}
}
	
