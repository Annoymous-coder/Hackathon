//This is suitable solution if number is sorted or else use bit-manipulation using XOR to find the result.
// Java program to find the element that appears only once 
import java.util.Arrays.*;
public class Main 
{ 
	// A Binary Search based method to find the element 
	// that appears only once 
	public static void search(int[] arr, int low, int high) 
	{ 	
      		Arrays.sort(nums);
		if(low > high) 
			return; 
		if(low == high) 
		{ 
			System.out.println("The required element is "+arr[low]); 
			return; 
		} 
		
		// Find the middle point 
		int mid = (low + high)/2; 
		
		// If mid is even and element next to mid is 
		// same as mid, then output element lies on 
		// right side, else on left side 
		if(mid % 2 == 0) 
		{ 
			if(arr[mid] == arr[mid+1]) 
				search(arr, mid+2, high); 
			else
				search(arr, low, mid); 
		} 
		// If mid is odd 
		else if(mid % 2 == 1) 
		{ 
			if(arr[mid] == arr[mid-1]) 
				search(arr, mid+1, high); 
			else
				search(arr, low, mid-1); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		int[] arr = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6}; 	
 
		search(arr, 0, arr.length-1); 
	}	 
} 

