package day3;
import java.util.*;
public class Q_2 {
public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the type of figure:");
	  String figure=scan.nextLine();
	  
	  switch(figure.toLowerCase())
	  {
	  case "circle":
		  Circle circle=new Circle();
		  System.out.println("Enter the radius: ");
		  float r=scan.nextFloat();
		  circle.calculateArea(r);
		  break;
	  case "square":
		  Square square=new Square();
		  System.out.println("Enter the side length");
		  float a=scan.nextFloat();
		  square.calculateArea(a);
		  break;
	  case "triangle":
		  Triangle triangle=new Triangle();
		  System.out.println("Enter the 1st side:");
		  float x=scan.nextFloat();
		  System.out.println("Enter the 2nd side:");
		  float y=scan.nextFloat();
		  System.out.println("Enter the 3rd side:");
		  float z=scan.nextFloat();
		  triangle.calculateArea(x, y, z);
		  break;
	  case "sphere":
		  Sphere sphere=new Sphere();
		  System.out.println("Enter the radius: ");
		  float r1=scan.nextFloat();
		  sphere.calculateArea(r1);
		  sphere.calculateVolume(r1);
		  break;
	  case "cuboid":
		  Cuboid cuboid =new Cuboid();
		  System.out.println("Enter the length:");
		  float l=scan.nextFloat();
		  System.out.println("Enter the breadth:");
		  float b=scan.nextFloat();
		  System.out.println("Enter the height:");
		  float h=scan.nextFloat();
	       cuboid.calculateArea(l,b,h);
	       cuboid.calculateVolume(l,b,h);
	       break;
	   default:
		   System.out.println("Enter correct shape.");
	  }
	 	  
	  scan.close();	  
}
}
interface CalcArea
{
	public void calculateArea(float r);
}
interface CalcVolume
{
	public void calculateVolume(float r);
}
class Circle implements CalcArea
{
	public void calculateArea(float r)
	{
		System.out.println("Area: "+ 3.14*r*r+" cm square");
	}
}
class Square implements CalcArea
{
	public void calculateArea(float a)
	{
		System.out.println("Area: "+a*a+" cm square");
	}
}
class Triangle implements CalcArea
{
	public void calculateArea(float a,float b,float c)
	{  
		float s=(a+b+c)/2;
		System.out.println("Area: "+Math.sqrt(s*(s-a)*(s-b)*(s-c))+" cm square");	
	}
	public void calculateArea(float r) {
		
		
	}
}
class Sphere implements CalcArea,CalcVolume
{
	public void calculateArea(float r)
	{
		System.out.println("Area: "+3.14*r*r+" cm square");
	}
	public void calculateVolume(float r)
	{
		System.out.println("Volume: "+3.14*1.4*r*r*r+" cm cube");
	}
}
class Cuboid implements CalcArea
{
	public void calculateArea(float l,float b,float h)
	{
		System.out.println("Area: "+2*(l*h+l*b+h*b)+" cm square");
	}
	public void calculateVolume(float l,float b,float h) 
	{
		System.out.println("Volume: "+l*b*h+" cm cube");
	}
	public void calculateArea(float l)
	{
		
	}
	public void calculateVolume(float l)
	{
		
	}
}
