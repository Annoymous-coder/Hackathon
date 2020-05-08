package practice;

import java.util.Scanner;

public class FibonacciTabulation {

	public int getFibo(int n)
	{
		int fibArr[] = new int[n];
		
		fibArr[0] = 0;
		fibArr[1] = 1;
		
		for(int i=2; i<fibArr.length; i++)
		{
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		return fibArr[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nth index position of a fibonacci Sequence");
        //Index of the fibonacci sequence . i.e Ex first n fibonacci numbers.
        int n = sc.nextInt();


        RecursiveFibonacciSolution obj = new RecursiveFibonacciSolution();
        
        long preTime = System.currentTimeMillis();
        System.out.println(obj.getfibo(n));
        long postTime = System.currentTimeMillis();
        System.out.println("The time taken to complete Bottom-Up(Tabulation) is "+ (postTime - preTime));
        
        sc.close();
	}
}
