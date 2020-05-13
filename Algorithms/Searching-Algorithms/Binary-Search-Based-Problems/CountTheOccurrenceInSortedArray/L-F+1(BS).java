//MOST OPTIMAL SOLUTION HAVING WORST CASE O(LOGN)

//MODIFIED VERSION OF BINARY SEARCH, USES THE CONCEPT OF FIRST AND LAST OCCURRECNE OF NUMBERS.

//FIRST FIND THE FIRST OCC & LAST OCC 

//THEN LASTOCC-FIRSTOCC+1 GIVES THE NUMBER OF TIMES THE KEY HAS APPEARED IN THE ARRAY

package BinarySearchBasedProblems;
import java.util.*;
public class FindCountOfAnElementInSortedListBSoptimal {

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
		
		int x = 5;
		
		int low = 0, high = a.length - 1;
		
		
		//calling first occurrence function
		int first = obj.searchFirstLastOcc(a, low, high, x, true);
		
		//calling last occurrence function
		int last = obj.searchFirstLastOcc(a, low, high, x, false);
		
		System.out.println("No of occurence of" + x + " is "  + (last - first + 1));
	
	}

}
