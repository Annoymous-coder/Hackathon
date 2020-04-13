//method 2 Time complexity O(n); Space complexity Extra Space; Sorted Array
//Logic is to keep a separate index called j for keeping track of the 
//no of unique element present and return to main so it can display only those elements.
//add the last element of array to unique array since it is not traversed.
//same as solution2 but a new temp array is used therefore extra space.
package practice;
import java.util.*;
public class RemoveDuplicatesInArray {

	public int getFinalIndex(int a[],int k)
	{	
		int j=0; 
		int temp[] = new int[k];
		for(int i=0;i<k-1;i++)
		{
			if(a[i]!=a[i+1]) //if next element is different then add to the array
			{
				temp[j++]=a[i];
			}
		}
		temp[j++] = a[k-1];  //add last element (unique/or not) it'll be unique since above if st. adds the element into the array only if it is unique.		
		for(int i=0;i<j;i++) //change the original array. finally containing only unique elements only.
		{
			a[i] = temp[i];
		}
		return j; //return the no of unique elements present
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		RemoveDuplicatesInArray obj = new RemoveDuplicatesInArray();
		int a[] = {1,2,2,3,4,4,6,7,7};
		int k = a.length;
		int n = obj.getFinalIndex(a, k);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
