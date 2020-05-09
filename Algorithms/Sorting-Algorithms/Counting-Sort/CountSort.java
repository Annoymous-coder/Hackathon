package Algorithms;

public class CountingSort {
	
	public void sort(int a[])
	{
		int count[] = new int[10]; //for simplicity assume that array only contains 0-9
		int res[] = new int[a.length]; //output array
		
		//Make all values 0 by default.
		for(int i=0; i<count.length; i++)
			count[i] = 0;
		
		//Put the occurence of every numbers in a into count array.
		for(int i=0 ; i<a.length; i++)
		{
		   count[a[i]]++;	
		}
		
		//Display the count of occurences of all elements
		int g = 0;
		for(int ele: count) {	
			System.out.println(g + " is occuring " + ele + " times");
			g++;
		}
		
		//Add the previous value to get the position in which they should be in the result array.
		for(int i=1; i<count.length; i++)
			count[i]+=count[i-1];
		
		//Display element at the position in which they should be at in the result array.
		int f=0;
		for(int ele : count) {
			System.out.println("Ele " + f + " should be at pos " + ele);
			f++;
		}
		
		
		//Print in reverse order to make it stable.
		//Since the count acts like an map which contains the index along with its correct position to placed for a element.
		//For ex if i=9 then go 9th position of count to get right position for element 9 it is 11 but since we are following 0-n subtract 1,
		//a[i] = 9 so put 9 at 10th postion to 9 or else res[10] = 9 ( a[10] )
		for(int i=res.length-1; i>=0; i--)
		{
			res[count[a[i]] - 1] = a[i];
			count[a[i]]--;
		}
		
		
		//Final output
		for(int ele : res)
			System.out.print(ele + " ");
		
	}
	
	public static void main(String[] args) {
	
		int a[] = {4,5,2,7,4,8,4,7,2,1,9};
		
		CountingSort obj = new CountingSort();
			
		obj.sort(a);
	}

}
