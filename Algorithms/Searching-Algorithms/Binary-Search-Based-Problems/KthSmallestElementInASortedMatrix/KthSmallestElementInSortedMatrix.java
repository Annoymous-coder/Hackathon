package BinarySearchBasedProblems;

public class KthSmallestElementIn2DSortedMatrix {
	
	public int getKthSmallestNumber(int [][]nums, int KthSmallest)
	{	
		int row_length = nums.length, col_length = nums[0].length;
		int low = nums[0][0] , high = nums[row_length-1][col_length-1];
		
		//When set to equal to it leads to infinite loop when all elements are same.
		while(low < high)
		{
			int mid = low + (high-low)/2;
			
			//data_set contains,
			//data_set[0]:count from low to mid inclusive, to know where mid is positioned from start, since Kth smallest element is required.
			//data_set[1]:maximum element in matrix i.e smaller than or equal to mid.
			//data_set[2]:minimum element in matrix i.e greater than mid.
			int data_set[] = getCount(nums, mid);
			
			//If the number is actually Kth element from start, return that element.
			if(KthSmallest == data_set[0])
				return data_set[1];
			
			//If the number of counts from start-mid inclusive is less then set low to smallest element greater than mid.
			if(data_set[0] < KthSmallest){
				low = data_set[2];
			}
			//If the number of counts from start-mid inclusive is greater then set high to largest element less than or equal to mid.
			else
				high = data_set[1];
		}
		return low;
	}
	
	
	public int[] getCount(int [][]nums, int searchElement)
	{
		int count = 0;
		
		int row = nums.length - 1;
		
		int col = 0;
		
		int max_value_less_than_mid = Integer.MIN_VALUE, min_value_greater_than_mid = Integer.MAX_VALUE;
		
		while(row >= 0 && col < nums[0].length)
		{	
			System.out.println("row = "+row+" col = " + col);
			if(nums[row][col] <= searchElement)
			{	
				System.out.println(nums[row][col] + " is less than " + searchElement);
				//The current row gives number of elements from start intially, 1 is for 1-based indexing.
				count = count + row + 1;
				max_value_less_than_mid = Math.max(max_value_less_than_mid, nums[row][col]);
				col++;
			}
			else if(nums[row][col] > searchElement)
			{	
				System.out.println(nums[row][col] + " is greater than " + searchElement);
				min_value_greater_than_mid = Math.min(min_value_greater_than_mid, nums[row][col]);
				row--;
			}
			
		}
		System.out.println(max_value_less_than_mid + "\t" + min_value_greater_than_mid);
		
		
		return new int[]{count , max_value_less_than_mid , min_value_greater_than_mid};
	}
	
	public static void main(String[] args) {
	
		int nums[][] = {
				{1,2},
				{1,3}
		};
		
		int KthSmallest = 1;
		
		KthSmallestElementIn2DSortedMatrix obj = new KthSmallestElementIn2DSortedMatrix();
		
		System.out.println("Kth smallest element is " + obj.getKthSmallestNumber(nums, KthSmallest));
		
	}

}
