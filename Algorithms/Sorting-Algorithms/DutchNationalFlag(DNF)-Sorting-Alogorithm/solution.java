//THIS ALGORITHM IS CALLED AS DUTCH NATIONAL FLAG ALGORITHM WHICH IS A TYPE OF SORTING ALGORITHM.
//THIS ALGORITHM IS ALSO CALLED AS DNF ALGORIHTM.
//THIS IS USED TO SORT 0,1,2 ELEMENTS MEANING HAVING LIMITED ELEMENTS LIKE 2,3 OR 4 DIFFERENT ELEMENTS ONLY IN ONE PASS.
//THIS INVOLVES MAINTAINING A POINTER TO EACH OF THE DIFFERENT ELEMENT PRESENT.
//FOR 3 DIFF ELEMENT WE MAKE 4 PARTITIONS 0-LOW-1, LOW-MID-1 . MID - HIGH , HIGH - N-1
//O-LOW-1 IS OF ZEROES AND LOW - MID-1 IS OF 1'S THEN IS THE UNKNOWN ELEMENTS THEN THE 2'S
//IDEA IS TO TRAVERSE AND PLACE 0'S AND 2'S IN THEIR PLACES BUT MOVE ON WHEN ENCOUNTERED BY 1'S
//READ MORE ABOUT IT HERE 
//http://users.monash.edu/~lloyd/tildeAlgDS/Sort/Flag/
//https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

//LOGIC IN THIS CODE IS:
//THERE ARE 3 ELEMENTS 0 , 1 AND 2
//WHEN WE SORT WE KNOW THAT 0 SHOULD BE PRESENT AT STARTING AND 2 SHOULD BE AT END.
//IN BETWEEN IS THE UNKNOWN ELEMENTS WHICH IS NEEDED TO BE SORTED.
//MAINTAINING THIS LOGIC WE DO THE FOLLOWING STEPS.
//START = 0, MID = 0 , END = N-1
//WE CHECK FOR MID. / MID IS A POINTER FOR 1
//WHEN THE A[MID] IS 0 THEN WE SWAP WITH A[LOW] SINCE IT SHOULD BE AT STARTING POSITION.ALSO INCREMENT START AND MID SINCE WE HAVE ALREADY TRAVERSED THIS SWAPPED ELEMENT.
//WHEN A[MID] IS 1 THEN WE JUST INCREMENT MID SINCE ITS AT THE RIGHT POSITION.
//WHEN A[MID] IS 2 THEN WE SWAP WITH A[HIGH] SINCE 2 MOST BE AT THE END. WE DECREASE HIGH SINCE THE AREA OF UNKNOWN IS SHRINKED BUT WE WILL NOT INCREMENT MID SINCE THE SWAPPED ELEMENT IS UNKNOWN 
//AND NEEDS TO BE PROCESSED.


package Algorithms;
import java.util.*;
public class DutchNationalFlagAlgorithm {
	
	public void dnfSort(int[] a)
	{	
		int start = 0 , mid = 0 , end = a.length - 1;
		
		while(mid <= end && start < end)
		{
			if(a[mid] == 0)
			{	
				a[mid] = a[start];
				a[start] = 0;
				start ++;
				mid++;
			}
			else if(a[mid] == 1)
			{
				mid++;
			}
			else if(a[mid] == 2)
			{
				a[mid] = a[end];
				a[end] = 2;
				end--;
			}
			for(int ele : a) {
				
				System.out.print(ele + " ");
		
			}
			System.out.println();
			System.out.println("start = " + start + " mid = " +  mid + " end = " + end);
			System.out.println();
		}
		
   }
	
	public static void main(String[] args) {
		
	    int a[] = { 2, 2, 1, 1, 2 ,2 ,2 ,2 ,1, 0};
		//int a[] = { 1 ,1, 1, 1, 2 ,0 ,2 ,2 ,2, 2};

		DutchNationalFlagAlgorithm obj = new DutchNationalFlagAlgorithm();
		
		obj.dnfSort(a);
	}
}


}