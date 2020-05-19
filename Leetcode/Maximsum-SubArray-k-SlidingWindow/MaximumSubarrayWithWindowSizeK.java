//LOGIC IS TO TRAVERSE THE FIRST WINDOW NORMALLY AND FIND OUT THE SUM OF FIRST WINDOW,
//THEN JUST ADD end+1 ELEMENT AND SUBTRACT end-k SINCE ONLY THESE 2 ELEMENTS DIFFER IN THE SUM FOR EVERY WINDOW.
MaximumSubarrayWithWipackage practice;
import java.util.*;
public class MaximumSubarrayWithWindowSizeK {

	public int getMax(int A[],int k)
	{	
		int maxNum = 0, wsum = 0;
		
		for(int i=0;i<k;i++)
		{
			wsum += A[i];
		}
		
		for(int end=k; end< A.length; end++)
		{	
			maxNum = wsum;
		    
			wsum += A[end] - A[end-k];
			if(wsum>maxNum){ 
				maxNum = wsum;
				System.out.println(A[end]+" ");
			}
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
ndowSizeK
