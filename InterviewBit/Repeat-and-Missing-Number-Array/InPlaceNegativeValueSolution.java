//Given a array of numbers having only one repeating number and a missing number, Goal is to find out these two numbers.
//Example A=[3,1,3] , The repeating number is 3 and missing number is 2.
//Asked in InterviewBit exchange.
//Solved using Hashset
//Found at InterviewBit https://www.interviewbit.com/problems/repeat-and-missing-number-array/
package practice;
import java.util.*;

public class FindMissingAndRepeatingNumber {
	
	public int[] getMissingAndRep(int a[])
	{	
		int missing = 0 , rep = 0;
		int res[] = new int[2];
		
		HashSet <Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) //Normal hashset method to find the duplicate.
		{
			if(set.contains(a[i]))
			{
				rep = a[i];
				missing = i;
			}
			else
			{
				set.add(a[i]);
			}
		}
		//To find Missing Number
		//Traverse from 1 to N since those are the numbers which will be present in the array
		//Then compare if this element is present in the Hashset or not. It takes more comparisons so see solution 2.
		for(int i=1; i<a.length; i++) 
		{
			if(set.contains(i)) {
				continue;
			}
			else
			{
				missing = i;
			}
		}
		res[1] = rep;
		res[0] = missing;
		
		return res;
	
	}
	//Method 2
	//Just the normal negative solution from first duplicate.
	//But to find the missing number just traverse again and find the positive number , its index + 1 is the missing number
	public int[] getMissingAndRep2(int arr[])
	{	
		int res[] = new int[2];	
		int rep = 0;
		int missing = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[Math.abs(arr[i]) - 1] < 0)
			{
				rep = Math.abs(arr[i]);
				//System.out.println(i);
				//missing = i+1;
			}
			else
			{
				arr[Math.abs(arr[i])  -1] = -arr[Math.abs(arr[i]) -1];
			}
		}
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i] > 0)
			{
				missing = i+1;
			}
		}
		res[1] = rep;
		res[0] = missing;
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {1,2,1,3,5}; //repeat is 1 and missing is 4.
		int a[] = {3,1,2,5,3}; //repeat is 3 and missing is 4.
		
		FindMissingAndRepeatingNumber obj = new FindMissingAndRepeatingNumber();
		System.out.print("The missing and repeated nos are: ");
		int res[] = obj.getMissingAndRep2(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
}
