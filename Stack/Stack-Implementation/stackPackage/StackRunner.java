package stackPackage;

public class StackRunner {

	public static void main(String[] args) {
	
		Stack nums = new Stack();
		
		nums.push(1);
		nums.push(2); 
		nums.push(3);
		nums.push(4);
		nums.push(5);
		
		System.out.println("The popped element is " + nums.pop());
		System.out.println("The popped element is " + nums.pop());
		System.out.println("The popped element is " + nums.pop());
		System.out.println("The popped element is " + nums.pop());
		
		System.out.println("The elements inside the stack are");
		nums.show();
		
		System.out.println("The peek element is " + nums.peek());
		
		System.out.println("Is the Stack Full : " + nums.isFull());
		System.out.println("Is the Stack Empty : " + nums.isEmpty());

	}

}
