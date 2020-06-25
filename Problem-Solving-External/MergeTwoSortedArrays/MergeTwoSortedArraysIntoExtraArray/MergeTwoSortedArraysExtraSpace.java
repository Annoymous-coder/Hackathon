package practice;

import java.util.*;

public class MergeTwoSortedArrays {

	public void mergeWithExtraSpace(int a[], int b[])
	{
		int s1 = 0, s2 = 0, count = 0;
		
		//To avoid the empty zeroes printed at last, use Integer array and check for not-null.
		Integer res[] = new Integer[a.length + b.length];
		while (s1 < a.length && s2 < b.length) {
			if (a[s1] < b[s2]) {
				res[count++] = a[s1];
				s1++;
			} else {
				res[count++] = b[s2];
				s2++;
			}
		}
		
		//If the elements are left out from being printed, then check which of the two array 
		//pointers have not reached its end(length of respective array) and print remaining element
		//until it reaches to end of array.
		if(s1 < a.length)
		{
			for(int i=s1-1; i<a.length; i++)
			{
				res[count++] = a[i];
			}
		}
		else if(s2 < b.length)
		{
			for(int i=s2; i<b.length; i++)
			{
				res[count++] = b[i];
			}
		}
		
		System.out.println("The merged array with extra space is :");
		for (int i = 0; i < res.length; i++) {
			if (res[i] != null) {
				System.out.print(res[i] + " ");
			}
		}
	}
	public static void main(String[] args) {

		int a[] = { 1, 6, 9, 11, 25, 87 };
		int b[] = { 4, 7, 8, 14, 98, 193 };

		MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
		obj.mergeWithExtraSpace(a, b);
	}
}

