//THIS PROBLEM IS SAME AS HOW MANY TIMES THE SORTED ARRAY HAS BEEN ROTATED.
//THIS PROBLEM IS SOLVED USING BINARY SEARCH APPROACH SINCE IT IS SORTED.
//THE LOGIC IS THAT THE NUMBER OF TIMES THE ARRAY HAS BEEN ROTATED IS GIVEN BY THE INDEX OF THE SMALLEST NUMBER.

//IN ORDER TO RETURN THE LEAST ELEMENT REPLACE return low and return mid by return a[low] and a[mid] respectively

package BinarySearchBasedProblems;
import java.util.*;
public class FindMinimumInRotatedSortedArray {
	
	public int search(int a[], int n)
	{	
		int low = 0, high = a.length - 1, mid = 0;;
				
		while(low <= high)
		{	
			mid = low+(high - low)/2;
		
			//If this condition is true then it is not rotated at all. Since first element is smaller than largest.
			//So return first element.
			if(a[low] <= a[high])
			{
				return low;
			}
			
			//Since the smallest element has a unique property of being smaller than both element lying of both directions.
			//So check for this condition.
			//%is required in case of rotations leading back to first element when mid is end. So mid+1 will not be there but because of mid+1%n we go back to the first element.
			//Same for mid-1 as well.
			int next = (mid+1)%n;
			int prev = (mid+high-1)%n;
			if(a[mid]<= a[next]  && a[mid] <= a[prev])
			{
				return mid;
			}
			
			//Check this segment between low and mid is sorted or not.
			//If sorted there is no chance of the number being there in that segment,
			//Since 
			else if(a[mid] >= a[low])
			{
				low = mid + 1;
			}
			else if(a[mid] <= a[high])
			{
				high = mid - 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int a[] = {15,22,23,28,31,38,5,6,8,10,12};
		
		int n = a.length;
		
		FindMinimumInRotatedSortedArray obj = new FindMinimumInRotatedSortedArray();
		
		int result = obj.search(a, n);
		System.out.println("The minimum element is present at / Sorted array has been rotated "+ result + " times / position");
	}

}
