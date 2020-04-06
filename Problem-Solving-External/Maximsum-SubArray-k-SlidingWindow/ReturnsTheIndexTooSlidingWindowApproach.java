package practice;
import java.util.*;
public class MaximumSubarrayWithWindowSizeK {

	public int getMax(int A[],int k)
	{	
		int maxNum = 0, wsum = 0;
		int start = 0, end = 0;
		
		for(int i=0;i<k;i++)
		{
			wsum+=A[i];
			start = 0;
			end = k-1;
		}
		for(int j=k;j<A.length;j++)
		{	
			maxNum = wsum;
			wsum = wsum - A[j-k] + A[j];
			if(wsum > maxNum){
				maxNum = wsum;
				start = j-k+1;
				end = j;
			}
		}
		
		
		System.out.println("start pos = "+start+"\n"+"end pos = "+end);
		
		return maxNum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MaximumSubarrayWithWindowSizeK obj = new MaximumSubarrayWithWindowSizeK();
		int A[] = {1,2,3,4,5,6,7,8};
		int k = 1;
		int maxNum = obj.getMax(A,k);
		System.out.println("The maximum subarray is "+maxNum);
	}
}
package practice;
import java.util.*;
public class MaximumSubarrayWithWindowSizeK {

	public int getMax(int A[],int k)
	{	
		int maxNum = 0, wsum = 0;
		int start = 0, end = 0;
		
		for(int i=0;i<k;i++)
		{
			wsum+=A[i];
			start = 0;
			end = k-1;
		}
		for(int j=k;j<A.length;j++)
		{	
			maxNum = wsum;
			wsum = wsum - A[j-k] + A[j];
			if(wsum > maxNum){
				maxNum = wsum;
				start = j-k+1;
				end = j;
			}
		}
		
		
		System.out.println("start pos = "+start+"\n"+"end pos = "+end);
		
		return maxNum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		MaximumSubarrayWithWindowSizeK obj = new MaximumSubarrayWithWindowSizeK();
		int A[] = {1,2,3,4,5,6,7,8};
		int k = 1;
		int maxNum = obj.getMax(A,k);
		System.out.println("The maximum subarray is "+maxNum);
	}
}
