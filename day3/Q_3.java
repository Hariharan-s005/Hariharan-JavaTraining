package day3;
import java.util.*;
public class Q_3 {
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
		System.out.println("Type pop to pop element and type exit to exit.");
		String typed=scan.nextLine();
		if(typed.equalsIgnoreCase("exit")) {
			System.out.println("Exiting....");
			return;
		}
		else if(typed.equalsIgnoreCase("pop"))
		System.out.println(fs.pop()+ " popped from stack.");
		else
			System.out.println("Enter corrrect word");
		}
	}
	else if(n==2)
	{   	    
		DynamicStack ds=new DynamicStack(2);
		ds.push(3);
		ds.push(4);
		//ds.push(5);
		System.out.println(ds.pop());
		System.out.println(ds.pop());
		//System.out.println(ds.pop());
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
  class DynamicStack implements Stack
  {
	  int stack[];
      int pointer;
      int size;
     public  DynamicStack(int size)
      {   this.size=size;
    	  stack=new int[size];
    	  pointer=-1;
      }

	@Override
	public void push(int element) {
		// TODO Auto-generated method stub
		if(!isFull())
		{
			pointer++;
			stack[pointer]=element;
		}
		else
		{
			resize(size*2);
			push(element);
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(!isEmpty())
		{
			return stack[pointer--];
		}
		if(pointer<size/4){
            resize(size/2);
            return pop();
       } 
		else 
		{
            System.out.println("The stack is already empty");
            return -1;
	    }
	}
	public boolean isFull()
	{
		if(pointer>=size-1)
		  return true;	  
		return false;

   }
	public boolean isEmpty()
	{
		if(pointer==-1)
			return true;
		return false;
	}
	public void resize(int newSize)
	{
		int newArray[]=new int[newSize];
		 for(int i=0;i<stack.length;i++)
		 {
			 newArray[i]=stack[i];
			 stack=newArray;
		 }
		 size=newSize;
	}
}
