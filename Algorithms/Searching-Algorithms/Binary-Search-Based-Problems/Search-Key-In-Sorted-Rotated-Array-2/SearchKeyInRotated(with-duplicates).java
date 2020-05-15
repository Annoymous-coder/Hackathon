//Given a sorted rotated array then return the index of given key element, return -1 if not found,

//This program supports duplicate elements to be present. Returns index if found else returns -1.

package BinarySearchBasedProblems;
import java.util.*;
public class SearchInSortedRotatedArray {

	public int searchElement(int a[], int low, int high, int key)
	{	
		
		//Array is empty
		if(a.length == 0)
			return -1;
		
		while(low <= high)
		{
			int mid = (low + high)/2;

			//case 1; When key is found directly at mid position, return mid.
			if(a[mid] == key)
			{
				return mid;
			}
			
			//Corner case: to handle duplicate elements.
			//Since when we rotate array with duplicate , then there are possibilities it lies same as low,mid & high
			//So ignore that case by reducing search space.
			if(a[mid] == a[high] ) {
				high--;
			}
			if(a[mid] == a[low]) {
				low++;
			}
			
			//---Any one segment low-mid-1 or mid+1-high will be sorted mandatorily---
			//Right half is sorted.So proceed like a normal Binary Search Algorithm.
			else if(a[mid] <= a[high])
			{
				//Check if key actually even exists within this range of right half, before proceeding.
				//The mid element will not be included in this range, because it is handled in case 1 already.
				if(key > a[mid] && key <=a[high])
				{   
					//Intially was at 0th index.
					low = mid + 1;
				}
				
				//The key is not present in right half.So it must be present in the other half.
				else
				{
					high = mid - 1;
				}	
			}
			
			//Left half is sorted.So proceed like a normal Binary Search algorithm.
			else if(a[mid] >= a[low])
			{
				//Check if key actually even exists within this range of left half, before proceeding.
				//The mid element will not be included in this range, because it is handled in case 1 already.
				if(key < a[mid] && key >=a[low])
				{   
					//Intially was at n-1th index.
					high = mid - 1;
				}
				
				//The key is not present in left half.So it must be present in the other half.
				else
				{
					low = mid + 1;
				}	
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
			
		//int a[] = {15,22,23,28,31,38,5,6,8,10,12};
		
		//int a[] = {};
		
		int a[] = {2,5,6,0,0,1,2}; //Repeated elements. 3 actually exists but gives -1.
		
		//int a[] = {5,6,1,2,2,3,4};
		
		SearchInSortedRotatedArray obj = new SearchInSortedRotatedArray();
		
		int key = 6;
		
		int low = 0, high = a.length - 1;
		
		System.out.println("The element " + key + " is found at index " + obj.searchElement(a, low, high, key));
	}

}
//Output: The element 4 is found at index 5
