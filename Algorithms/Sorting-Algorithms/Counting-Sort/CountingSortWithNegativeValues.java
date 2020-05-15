//LOGIC IS SAME AS NORMAL COUNTING SORT, BUT THE ONLY CHANGE IS TO NORMALIZE THE VALUES 
//MAKE ALL POSITIVE BY ADDING MOST abs(MOST NEGATIVE NUMBER TO ALL ELEMENTS) 
//EXAMPLE: -5, -10, 0, -3, 8, 5, -1, 10 ADD +10 TO ALL ELEMENTS SO IT BECOMES 5,0,7,18,25,9,20 SO ALL ARE POSITIVE NOW .
//THE RANGE OF DIFFRENT NUMBERS TO BE PRESENT IN LOOKUP TABLE THAT IS COUNT ARRAY IS GIVEN BY THE RANGE = MAX - MIN + 1, 19 FOR THIS EXAMPLE.
//THEN SORT THESE POSITIVE NUMBERS LIKE REGULAR COUNTING SORT THEN SUBTRACT THE ABS(MIN) TO ALL VALUES TO GET THE ORIGINAL SORTED ARRAY.


package Algorithms;

import java.util.Arrays;

public class CountingSortNegativeNos {
	
	public void sortwithNeg(int a[])
	{
		
		int res[] = new int[a.length]; //output array
		
		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();
		int range = max - min + 1;
		
		int count[] = new int[range];
		//Make all values 0 by default.
		for(int i=0; i<range; i++)
			count[i] = 0;
		
		//Normalize all values of a[]
		for(int i=0; i<a.length; i++)
		{
			a[i] = a[i]+ Math.abs(min);
		}
		
		//Display normalized values
		for(int ele: a)
			System.out.print(ele + " ");
		
		System.out.println();
		
		//Put the occurrence of every numbers in a into count array.
		for(int i=0 ; i<a.length; i++)
		{
		   count[a[i]]++;	
		}
		
		//Display the count of occurrences of all elements
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
		//For ex: if i=9 then go 9th position of count to get right position for element 9 it is 11 but since we are following 0-n subtract 1,
		//a[i] = 9 so put 9 at 10th position to 9 or else res[10] = 9 ( a[10] )
		for(int i=res.length-1; i>=0; i--)
		{
			res[count[a[i]] - 1] = a[i];
			count[a[i]]--;
		}
		
		//Output before de-normalizing
		System.out.println("Output before de-normalizing:");
		for(int ele : res)
			System.out.print(ele + " ");
		
		System.out.println();
		
		//Perform de-normalizing
		for(int i=0; i<res.length; i++)
		{
			res[i] = res[i] - Math.abs(min);
		}
		
		System.out.println("Final answer :");
		//Output after de-normalizing
		for(int ele: res)
			System.out.print(ele + " ");
	}
	
	public static void main(String[] args) {
	
		int[] a = {-5, -10, 0, -3, 8, 5, -1, 10}; 
		
		CountingSortNegativeNos obj = new CountingSortNegativeNos();
			
		obj.sortwithNeg(a);
	}

}
