//PROGRAM TO FIND THE FIRST/LAST OCCURRENCE OF A KEY IN A SORTED ARRAY.

//THIS IS THE ITERATIVE IMPLEMENTATION USING BINARY SEARCH.
//IF A KEY IS FOUND THEN , IN THE HOPE OF FINDING IT LEAST/HIGHEST INDEX ACCORDING TO FIRST/LAST OCCURENCE , UPDATE THE SEARCH SPACE.
//FOR FIRST OCC WHEN KEY IS FOUND, UPDATE HIGH TO MID-1 IN HOPE OF FINDING IT IN LEFT HAND SIDE THEREBY THE LEAST INDEX.
//OPPOSITE OF LAST OCCURRENCE.


package BinarySearchBasedProblems;
import java.util.*;
public class FirstLastOccurenceOfKeyIterative {

	public int searchFirstLastOcc(int a[], int low, int high, int x, boolean isFirst)
	{
		int result = -1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(a[mid]==x)
			{
				if(isFirst == true)
				{	
					result=mid;
					high = mid-1;
				}
				else
				{
					result=mid;
					low = mid+1;
				}
			}
			
			else if(x < a[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		
		FirstLastOccurenceOfKeyIterative obj = new FirstLastOccurenceOfKeyIterative();
		
		int a[] = { 1,1,3,3,5,5,5,5,5,6,6,9,9,11 };
		
		//int a[] = { 2,2,2,2,2,3,3 };
		
		int x = 1;
		
		int low = 0, high = a.length - 1;
		
		
		//true for searching first occurrence and false for searching last occurrence in the array.
		boolean isFirst = false;
		
		if(isFirst == true) 
			System.out.println("First occurence of " + x + " is at "  + obj.searchFirstLastOcc(a, low, high, x, isFirst));
		else
			System.out.println("Last occurence of " + x + " is at "  + obj.searchFirstLastOcc(a, low, high, x, isFirst));
	
	}

}
