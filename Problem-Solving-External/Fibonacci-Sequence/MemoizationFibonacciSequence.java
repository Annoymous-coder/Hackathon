public package practice;
import java.util.HashMap;
import java.util.Scanner;
public class MemoizationFibonacciSequence {

    public int getfibo(int n)
    {          
    	HashMap <Integer,Integer> memo = new HashMap <Integer,Integer>();
    	
    	if(memo.containsKey(n)) {
    		return memo.get(n);
    	}
    	
    	int value = 0;
    	if(n == 0)
    		return 0;
    	else if (n==1)
    		return 1;
    	
    	else {
	    	value = getfibo(n-1) + getfibo(n-2);
	    	memo.put(n,value);
	    	System.out.println("here"+memo.get(0));
	    	return value;
    	}
    }
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nth index position of a fibonacci Sequence");
        //Index of the fibonacci sequence . i.e Ex first n fibonacci numbers.
        int n = sc.nextInt();


        RecursiveFibonacciSolution obj = new RecursiveFibonacciSolution();
        
        long preTime = System.currentTimeMillis();
        System.out.println(obj.getfibo(n));
        long postTime = System.currentTimeMillis();
        System.out.println("The time taken to complete Recursively-Memo is "+ (postTime - preTime));
        
        sc.close();
    }
}
