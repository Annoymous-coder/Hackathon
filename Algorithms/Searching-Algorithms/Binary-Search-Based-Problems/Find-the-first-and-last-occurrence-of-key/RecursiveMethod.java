//This program is used to find the first or the last occurrence of the number in a sorted array.
//Using binary search approach with recursion.
//This is implemented using recursive strategy
//The isFirst decides to search for first occ or last occurrence.

package BinarySearchBasedProblems;
import java.util.*;
public class FirstLastOccurenceOfKeyRecursive 
{
	public int searchFirstLastOcc(int a[], int low, int high, int x, boolean isFirst)
	{	
		int result = -1;
		
		//To halt the recursion, recurse until low<=high.
		if(low>high)
			return 0;
		
		int mid = (low+high)/2;
		
		//if key is found
		if(a[mid]==x)
		{	
			//First-Occurrence
			//save the first-time index in result and subsequent reult in res1. Since its first occ, select the index with least value.
			if(isFirst == true) {
				result = mid;
				//Go search left only if the left adjacent element is same as mid. Or else it leads to faulty result since it returns 0 everytime.
				//Example 2 2 2 2 3 3 . Final result is 4 for key=3. But when this if is not included then it returns 0
				//Since we go on searching towards left of index 4 by making high = mid-1, and visiting 0th index and returning it since 0<4 for this reason check for left-adjacent element.
				if(a[mid-1]==a[mid]) {
					//Search for the smaller index towards left of arbitrarily found key. Only when left-ele is also same. 
					
					//Reason for math.min is since the recursion uses stack with LIFO principle, it returns the last found value(index), which is the greatest and it found first,
					//which is not what we need , we need to have a value which is least irrespective of found first or last. 
					//So maintain local-minimum to keep track of least of all historical values(indices).
					int res1 = searchFirstLastOcc(a, low, mid-1 , x , isFirst);
			   		result = Math.min(result, res1);
				}
			}
			//All of above applies here,
			//Only change is to search towards right instead of left and keep track of largest index found till now.
			else 
			{
				result = mid;
				if(a[mid-1]==a[mid]) {
					int res1 = searchFirstLastOcc(a, low, mid-1 , x , isFirst);
			   		result = Math.min(result, res1);
				}
			}
		}
		
		else if(x < a[mid])
			return searchFirstLastOcc(a, low, mid-1, x , isFirst);
		else if(x > a[mid])
			return searchFirstLastOcc(a, mid+1, high, x , isFirst);
		
		return result;
	}
	
	public static void main(String args[])
	{
		FirstLastOccurenceOfKeyRecursive obj = new FirstLastOccurenceOfKeyRecursive();
		
		int a[] = { 1,1,3,3,5,5,5,5,5,6,6,9,9,11 };
		
		//int a[] = { 2,2,2,2,2,3,3 };
		
		int x = 5;
		
		int low = 0, high = a.length - 1;
		
		
		//true for searching first occurrence and false for searching last occurrence in the array.
		boolean isFirst = true;
		
		if(isFirst == true) 
			System.out.println("First occurence of " + x + " is at "  + obj.searchFirstLastOcc(a, low, high, x, isFirst));
		else
			System.out.println("Last occurence of " + x + " is at "  + obj.searchFirstLastOcc(a, low, high, x, isFirst));
		
	}
	
}
