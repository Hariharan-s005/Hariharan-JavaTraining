package day2.four;

import java.util.Scanner;


public class StackImplementation {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the stack size: ");
    	int n=scan.nextInt();
		FixedStack stack=new FixedStack(n);
		System.out.println("Enter the stack elements");
		for(int i=0;i<n;i++)
		{
			stack.push(scan.nextInt());
		}
		scan.nextLine();
		while(true) {
			System.out.println("Type pop to pop element and type exit to exit.");
			String typed=scan.nextLine();
			if(typed.equalsIgnoreCase("exit")) {
				System.out.println("Exiting....");
				return;
			}
			else if(typed.equalsIgnoreCase("pop"))
			System.out.println(stack.pop()+ " popped from stack.");
			else
				System.out.println("Enter corrrect word");
			}
				
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

