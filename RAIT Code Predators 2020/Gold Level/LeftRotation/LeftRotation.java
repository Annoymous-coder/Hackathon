package practice;

import java.util.Scanner;

public class LeftRotation {
	
	public int[] RotateLeftKTimes(int size, int[] nums, int k)
	{	
		int start = 0, end = 0;
		
		reverse(nums, 0, nums.length-1);
		reverse(nums, k, nums.length-1);
		reverse(nums, 0, k-1);
	
		return nums;
	}
	
	public int[] reverse(int[] nums, int start, int end)
	{
		int temp = 0;
		
		while(start < end)
		{
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start++;
			end--;
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int nums[] = new int[size];
		for(int i=0; i<size; i++)
			nums[i] = sc.nextInt();
		int k = sc.nextInt();
		
		LeftRotation obj = new LeftRotation();
		nums = obj.RotateLeftKTimes(size, nums, k);
		
		for(int ele : nums)
			System.out.print(ele + " ");
	}

}
