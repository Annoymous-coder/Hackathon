package practice;
import java.util.*;
public class MaximumSubarrayWithWindowSizeK {

	public int getMax(int A[],int k)
	{	
		int maxNum = 0, wsum = 0;
		int start = 0, end = 0;
		for(int i=0; i<A.length-k+1; i++)
		{	
			wsum =0;
			for(int j=i; j<k+i; j++)
			{
				wsum+=A[j];
				start = i;
				end = j;
				if(wsum > maxNum)
				{
					maxNum = wsum;
					
				}
			}
			
		}
		System.out.println(start+" "+end);
		
		return maxNum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MaximumSubarrayWithWindowSizeK obj = new MaximumSubarrayWithWindowSizeK();
		int A[] = {1,2,3,4,5,6,7,8};
		int k = 4;
		int maxNum = obj.getMax(A,k);
		System.out.println(maxNum);
	}
}
