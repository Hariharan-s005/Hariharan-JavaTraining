package day1.twentyseven;

import java.util.Scanner;

public class InvestmentValue {
	   public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the amount invested: ");
		float amount=scan.nextFloat();
			int choice=-1;
		while(choice!=0)
		{   
			
			System.out.println("Enter your choice:");
			System.out.println("Press 1 to enter percentage increase:");
			System.out.println("Press 2 to enter percentage decrease:");
			System.out.println("Press 3 to enter increase by a specific amount:");
			System.out.println("Press 4 to enter decrease by a specific amount:");
			System.out.println("Press 5 to display the amount value and exit:");
			choice=scan.nextInt();

		switch(choice) {
			case 1:
				System.out.println("Enter the  percentage by which it increased: ");
				float increasedByPercentage=scan.nextFloat();
				amount=calculateIncreasePercentage(amount,increasedByPercentage);
				break;
			case 2:
				System.out.println("Enter the  percentage by which it decreased: ");
				float decreasedByPercentage=scan.nextFloat();
				amount=calculateDecreasePercentage(amount,decreasedByPercentage);
				break;
			case 3:
				System.out.println("Enter the value by which it increased: ");
				float increasedBy=scan.nextFloat();
				amount=calculateIncrease(amount,increasedBy);
				break;
			case 4:
			    System.out.println("Enter the value by which it decreased: ");
				float decreasedBy=scan.nextFloat();
				amount=calculateDecrease(amount,decreasedBy);
				break;
			case 5:
			    System.out.println("The investment would be worth: "+amount);
			     return;
	        default:
	        	System.out.println("Enter the correct option: ");
	        	break;
				
		}
		}
		scan.close();
		
	}
	   static float calculateIncreasePercentage(float amount,float increasedBy)
	   {
		   return amount+(amount*increasedBy/100);
	   }
	   static float calculateDecreasePercentage(float amount,float increasedBy)
	   {
		   return amount-(amount*increasedBy/100);
	   }

	   static float calculateDecrease(float amount,float decreasedBy)
	   {
		   return amount-decreasedBy;
	   }
	   static float calculateIncrease(float amount,float increasedBy)
	   {
		   return amount+increasedBy;
	   }


	}
