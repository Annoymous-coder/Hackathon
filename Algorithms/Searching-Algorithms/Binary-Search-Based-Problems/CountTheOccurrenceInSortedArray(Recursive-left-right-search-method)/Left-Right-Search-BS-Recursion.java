//Given a sorted element count the occurrence of the number using Binary Search and moving left and right of found element
//Method1;--Left-Right--Search--After--Finding--First--Time
//O(n) worst case: when all elements are the same: To handle this implement using method2 of BinarySearchModification.
//Better way to solve it is using the Last Occurrence - First Occurrence + 1 method using Binary Search

package BinarySearchBasedProblems;
import java.util.*;
public class FindCountOfAnElementInSortedList {
	
	//x is the element for which the occurrence in the array is to be found out.
	public int search(int a[], int low, int high, int x)
	{	
		//since we traverse during iterative BS until (low<=high) is satisfied,
		//since this is a stopping-case for recursion which is going to opposite of allowed area of search.
		//meaning when left pointer crosses the right one we stop the recursive calls.
		if(low>high)
			return 0;
		
		//Normal cal. of mid element
		int mid = (low+high)/2;
		
		//When we find the required key, we again divide the search space 
		//If there are multiple key elements found then they all are adjacent to each other.
		//So traverse the key elements which are present in the right side of the mid + the elements which are present on the left side of the mid.
		//Since mid element is not traversed again, we add 1 to our count.
		if(a[mid] == x)
			return 1+search(a,low,mid-1,x)+search(a,mid+1,high,x);
		
		//In-case we do not find the key element yet,
		//Normal Binary search to find it using recursive calls by dividing the search space.
		if(a[mid] > x)
			return search(a, low, mid-1, x);
		else if(a[mid] < x)
			return search(a, mid+1, high, x);
		
		throw new IllegalArgumentException("Invalid");
	}
	
	public static void main(String args[])
	{
		FindCountOfAnElementInSortedList obj = new FindCountOfAnElementInSortedList();
		
		int a[] = { 1,1,3,3,5,5,5,5,5,9,9,11 };
		
		int x = 5;
		int low = 0, high = a.length - 1;
		
		System.out.println("No of occurence of" + x + " is "  + obj.search(a, low, high, x));
		
	}
	
}
