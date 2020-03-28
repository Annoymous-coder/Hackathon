package practice;
import java.util.*;
public class MaximumSubarrayWithWindowSizeK {

	public int getMax(int A[],int k)
	{	
		int maxNum = 0, wsum = 0;
		
		for(int i=0; i<=k; i++)
		{	
			wsum =0;
			int j=i;
			/?while(j<k+i)
			{
				wsum += A[j];
				j++;
			}?/
			
			for(int j=i; j<k+i; j++)
			{
				wsum+=A[j];
			}
			maxNum = Math.max(wsum, maxNum);
		}
		
		
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
