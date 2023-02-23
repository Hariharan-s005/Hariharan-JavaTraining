package day3.three;

import java.util.Scanner;


public class StackImplementation {
	  public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Press 1 for a Fixed Stack and press 2 for a Dynamic Stack");
		int n=scan.nextInt();
		if(n==1)
		{
			System.out.println("Enter the size of the Stack:");
			int size=scan.nextInt();
			FixedStack fs=new FixedStack(size);
			System.out.println("Enter the stack elements");
			for(int i=0;i<size;i++)
			{
				fs.push(scan.nextInt());
			}
			scan.nextLine();
			while(true) {
			System.out.println("Type pop to pop element,print to print Stack and type exit to exit.");
			String typed=scan.nextLine();
			if(typed.equalsIgnoreCase("exit")) {
				System.out.println("Exiting....");
				return;
			}
			else if(typed.equalsIgnoreCase("pop"))
			System.out.println(fs.pop()+ " popped from stack.");
			else if(typed.equalsIgnoreCase("print"))
			{
				for(int i=0;i<size;i++)
				{
					System.out.println();
				}
			}

			else
				System.out.println("Enter corrrect word");
			}
		}
		else if(n==2)
		{   	    
			   DynamicStack ds = new DynamicStack();
			   System.out.println("Dynamic Stack.....");
							
				while(true) {
				System.out.println("Type push to push elememt,pop to pop element,and type exit to exit.");
				String typed=scan.nextLine();
				if(typed.equalsIgnoreCase("exit")) {
					System.out.println("Exiting....");
					return;
				}
				else if(typed.equalsIgnoreCase("pop"))
				System.out.println(" popped from stack.");
				else if(typed.equalsIgnoreCase("push"))
					ds.push(scan.nextInt());
				else if(typed.equalsIgnoreCase("print"))
						 ds.PrintStack();
						
				else
					System.out.println("Enter corrrect word");
				
				}
				

	       }
				scan.close();
		}	
	}

	  interface Stack
	  {
		   void push(int element);
		   int pop();
	  }
	  class FixedStack implements Stack
	  {
	      int stack[];
	      int pointer;
	      FixedStack(int size)
	      {
	    	  stack=new int[size];
	    	  pointer=-1;
	      }
	      
			@Override
			public void push(int element) {
				if(pointer==stack.length-1)
				{
					System.out.println("The Stack is Overflowing");
					
				}
				else
				{
					stack[++pointer]=element;
				}
			}
			
			@Override
			public int pop() {
				if(pointer<0)
				{
					System.out.println("The stack is Underflowing");
					return 0;
				}
				else
				{
					return stack[pointer--];
				}
			} 	  
	  }
	  class DynamicStack implements Stack{
			
			class Node {
				int data;
				Node next;
			}
			
			Node top;
			
			DynamicStack() {
				this.top = null;
			}
			
			public void push(int num) {
				Node temp = new Node();
				temp.data = num;
				temp.next = top;
				top = temp;
			}
			
			public int pop() {
				if(top == null) {
					System.out.println("Stack Underflow....");
					return -1;
				}
				else {
					Node temp = top;
					top = top.next;
					return temp.data;
					
				}
			}
			
			public void PrintStack() {
				if(top == null) {
					System.out.println("Stack Empty");
				}
				else {
					Node temp = top;
					
					while(temp != null) {
						System.out.print(temp.data+"->");
						temp = temp.next;
					}
			}
			}
			
		}
			