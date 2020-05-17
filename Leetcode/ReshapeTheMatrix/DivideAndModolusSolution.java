package practice;
import java.util.*;
class ReshapeMatrix
{	
	public int[][] reshape(int nums[][], int r, int c)
	{	
		//Check if newly desired parameters i.e r and c are feasible to hold all values.
		if(nums.length * nums[0].length != r*c) {
			System.out.println("Not possible to reshape the array. Size does not match");
			return nums;
		}
		else if(nums.length == 0)
		{
			System.out.println("Array is empty, cannot reshape array");
			return nums;
		}
		
		int res[][] = new int[r][c];
		
		int a[] = new int[r*c];
		
		int pos = 0;
		
		//Filling 1D matrix from 2D array.
		/*
		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums[0].length; j++)
			{	
				 //Cannot handle these cases {1},{2},{3},{4} 2,2
				 //[[2,5],[8,4],[0,-1]] 6 1
				 pos = nums.length*i+j;
				 a[pos] = nums[i][j];
			}
		}
		*/
		
		//Converted 2D to 1D array.
		System.out.println("1D Array ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		/*
		//Filling 1D array elements into newly desired 2D array.
		//i.e converting 1D array into 2D array.
		for(int i=0; i<a.length; i++)
		{
			res[i/c][i%c] = a[i];
		}
		*/
		
		//The above method is good for explanation but it cannot handle all test-cases.
		//This can also be performed alternatively.
		//Since all 2D arrays are stored in the form of 1D matrix in storage using [n*i+j],
		//We can directly move these elements from 2D array to resultant array using this concept.
		//That is we keep a count variable to keep track of the index to be moved to res array.
		//Traverse the given matrix normally, place at count index using / and % operator in their positions,
		//which is given by count.
		int count = 0;
		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums[0].length; j++)
			{
				res[count/c][count%c] = nums[i][j];
				count++;
			}
		}
		
		return res;
	}
	
	public static void main(String args[])
	{
		int nums[][] = {
				//{1},{2},{3},{4}
				//{1,2,3,4}
				{2,5},{8,4},{0,-1}
						

		};
		
		//Desired row and column numbers in output array.
		int r = 6, c = 1;
		
		System.out.println("before");
		for(int i=0; i<nums.length; i++)
		{
			for(int j=0; j<nums[0].length; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		ReshapeMatrix obj = new ReshapeMatrix();
		nums = obj.reshape(nums, r, c);
		
		System.out.println("after");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}


/*
--------------------------------------------------

Internally 2D arays are stored in the form of 1D array itself.
n=length of 2D array, i=row_position , j=col_position
Stored in the form of [n*i+j]

[ [1,2],    = [1,2,3,4]
  [3,4] ] 
  
Here n = 2, 1 goes into 2*0+0th=0 pos ins 1D, 2 goes into position 2*0+1th=1 pos in 1D, 3 goes into position 2*1+1th=2 pos in 1D and 4 goes into 2*1+1th=3 pos in 1D array

--------------------------------------------------

Given an index in 1D array, In order to find that index element in 2D array use / and % operator over the row_size; i.e if mid = 5 in 1D array, equivalent position in 2D array is 
nums[mid/col][mid%col]

--------------------------------------------------

Approach #3 Using division and modulus [Accepted]

Algorithm

In the last approach, we needed to keep a track of when we reached the end of columns for the resultant matrix and needed to update the current row and column number for putting the extracted elements by checking the current indices every time. Instead of doing these limit checks at every step, we can make use of maths to help ease the situation.

The idea behind this approach is as follows. Do you know how a 2-D array is stored in the main memory(which is 1-D in nature)? It is internally represented as a 1-D array only. The element nums[i][j]nums[i][j]nums[i][j] of numsnumsnums array is represented in the form of a one dimensional array by using the index in the form: nums[n*i+j]nums[n*i + j]nums[n*i+j], where mmm is the number of columns in the given matrix. Looking at the same in the reverse order, while putting the elements in the elements in the resultant matrix, we can make use of a countcountcount variable which gets incremented for every element traversed as if we are putting the elements in a 1-D resultant array. But, to convert the countcountcount back into 2-D matrix indices with a column count of ccc, we can obtain the indices as res[count/c][count%c]res[count/c][count\%c]res[count/c][count%c] where count/ccount/ccount/c is the row number and count%ccount\%ccount%c is the coloumn number. Thus, we can save the extra checking required at each step.





*/