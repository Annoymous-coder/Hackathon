package stackPackage;

public class Stack {
	
	//TODO Implement Dyanamic Array
	private int stackArray[] = new int[5];
	
	private int top = 0;
	
	//Check if the stack is full, the stack is full if top equals the len of array.
	public boolean isFull()				
	{
		if(top == stackArray.length)
		{
			return true;
		}

		return false;
	}
	
	//Push element after checking for overflow. Intially top is at 0, so inc after performing push.
	public void push(int data)
	{	
		if(isFull())
			System.out.println("Stack Overflow : Cannot perform Push");
		else {
			stackArray[top] = data;
			top++;
		}
	}
	
	//Check if the stack is empty, the stack is empty if top equals the min size i.e 0.
	public boolean isEmpty()
	{
		if(top == 0)
			return true;
		
		return false;
	}
	
	//Pop element after checking for underflow. Intially top is pointing towards an higher ele , so dec before pop.
	public int pop()
	{	
		if(isEmpty()) {
			System.out.println("Stack Underflow : Cannot perform Pop");
		}
			int popEle = 0;
			top--;
			popEle = stackArray[top];
			stackArray[top] = 0;
		return popEle;
		
	}
	
	//Peek element after checking for underflow.Performs same as Pop() but does not reset the element to 0.
	public int peek()
	{
		if(isEmpty()) {
			System.out.println("Stack Underflow : Cannot perform Peek");
		}
		int peekEle = 0;
		top--;
		peekEle = stackArray[top];
		
		return peekEle;
	}
	
	//Display all the existing elements in the stack.Intially top is pointing towards an immediate higher element so dec top by 1.
	public void show()
	{
		for(int i = top - 1; i >= 0; i--)
		{
			System.out.println(stackArray[i]);
		}
	}
	
}
