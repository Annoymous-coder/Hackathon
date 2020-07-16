package Algorithms;
import java.util.*;
public class MergeSortAlgorithm {
	
	public void MergeSort(int nums[])
	{
		if(nums.length < 2)
			return;
		
		int mid = nums.length/2;
		int left[] = new int[mid];
		int right[] = new int[nums.length - mid];
		
		for(int i=0; i<mid; i++)
		{
			left[i] = nums[i];
		}
		
		for(int j=0; j<right.length; j++)
		{   
			// j starts from 0, but not for nums. It has continue whats finished from left part.
			right[j] = nums[j+mid];
		}
		
		MergeSort(left);
		MergeSort(right);
		Merge(left, right, nums);
		
		
		
	}
	public int[] Merge(int left[], int right[], int nums[])
	{
		int i=0, j=0, k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i] < right[j])
			{
				nums[k] = left[i];
				i++;
			}
			else
			{
				nums[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			nums[k++] = left[i++];
		}
		while(j<right.length)
		{
			nums[k++] = right[j++];
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the array elements");
		int nums[] = new int[size];
		for(int i=0; i<size; i++)
		{
			nums[i] = sc.nextInt();
		}
		
		MergeSortAlgorithm object = new MergeSortAlgorithm();
	    object.MergeSort(nums);
		
		for(int ele: nums)
			System.out.print(ele + " ");
	}

}


/* Stack calls order for {4 3 2 1} [LIFO] order. So the first stack call is at the bottom.
 * 		  
 *   4 3 2 1
 *  4 3   
 * 4   
 * 
 *   4 3 2 1
 *  4 3   
 * 4   3
 * 
 *   4 3 2 1
 *  3 4   
 * 3   4
 *
 *   4 3 2 1
 *  3 4   2 1 
 * 3   4 2 
 * 
 *   4 3 2 1
 *  3 4   2 1 
 * 3   4 2   1
 * 
 *   4 3 1 2
 *  3 4   1 2 
 * 3   4 1   2
 * 
 *   1 2 3 4
 *  3 4   1 2 
 * 3   4 1   2
 * 
 * The order of completion is strictly downwards. First finish all left then backtrack to previous 
 * call stack which might be right , later merge for the original left subtree. This process is also 
 * repeated for right hand side of the tree[call stack]. Uses DFS + LIFO approach because of recursive call.
*/