
package practice;

public class BinarySearch {
	public int getTargetIndex(int a[], int target)
	{
		int low = 0;
		int high = a.length - 1;
		int mid;
		int i=1;
		while(low <= high) //<= here "=" is required because when target is in index 0,the low is at by defalut 0
						   //but high should be equal to low in order for the mid ele == target 
		{	
			mid = (low + high)/2;
			System.out.println("low "+low+" "+"high "+high+" "+"mid "+mid);
			if(a[mid] == target)
				return mid;
			 if(target < a[mid])
			{
				high = mid - 1;
			}
			else if(target > a[mid])
			{
				low = mid + 1;
			}
			System.out.println("end of loop "+i++);
		}
		throw new IllegalArgumentException("Element not found");
	}
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
				 //0,1,2,3,4,5,6,7,8
		int target = 2;
		
		BinarySearch obj = new BinarySearch();
		System.out.println("The index is found at: "+obj.getTargetIndex(a,target));
	}
}
