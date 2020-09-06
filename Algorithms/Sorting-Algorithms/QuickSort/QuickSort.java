package Algorithms;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class QuickSortAlgorithm {
	
	public void QuickSort(int nums[], int beg, int end)
	{
		if(beg < end)
		{
			int RandomizedpartitionIndex = Partition(nums, beg, end);
			QuickSort(nums, beg, RandomizedpartitionIndex-1);
			QuickSort(nums, RandomizedpartitionIndex+1, end);
		}
	}
	
	// Choosing the last element as pivot might not always generate a balanced partition,
	// Choose any random element within [beg,end] and swap that element with end index position.
	// Call the normal Partition function then onwards. As the last element is replaced with a random element.
	public void RandomizedPartition(int nums[], int beg, int end)
	{
		int randomPivotIndex = ThreadLocalRandom.current().nextInt(beg, end + 1);
		int temp = nums[randomPivotIndex];
		nums[randomPivotIndex] = nums[end];
		nums[end] = temp;	
     		Partition(nums, beg, end);
	}
	
	// This partition algorithm is Lomuto's Partition schema.
	// It is different from Horare's schema which was original schema of Quick Sort.
	public int Partition(int nums[], int beg, int end)
	{
		int pivot = nums[end];
		int pivotIndex = beg;
		
		for(int i=beg; i<end; i++)
		{
			if(nums[i] <= pivot)
			{
				int temp = nums[i];
				nums[i] = nums[pivotIndex];
				nums[pivotIndex] = temp;
				pivotIndex++;
				
				// pivotIndex is a pointer at which the pivot must be after completion of Partition
				// i.e all the elements to its left must be <= pivot and on its right side all elements 
				// must be strictly higher than pivot.
				
				// This for-loop does the exact same thing, if the i-th element is less than pivot, 
				// swap the i-th element with the one which is pointing at pivotIndex(where pivot must actually be).
				// also increment the pivotIndex by 1. This makes all elements on LHS as <= pivot.
				
				// 5 4 2 1 3
				// 2 4 5 1 3
				// 2 1 5 4 3
				
				// 3 is pivot and pivotIndex initially at 0 is at 2 position after the completion of this loop.	
			}
		}
		
		// Swap the pivot and element at pivotIndex so that it is now officially at its correct position.
		int temp = nums[end];
		nums[end] = nums[pivotIndex];
		nums[pivotIndex] = temp;
		
		return pivotIndex;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the array elements");
		int nums[] = new int[n];
		Random r = new Random();
		for(int i=0; i<n; i++)
		{
			nums[i] = r.nextInt(100);
		}
		
		QuickSortAlgorithm object = new QuickSortAlgorithm();
		object.QuickSort(nums, 0, nums.length-1);
		
		for(int ele: nums)
			System.out.print(ele + " ");
	}
}
