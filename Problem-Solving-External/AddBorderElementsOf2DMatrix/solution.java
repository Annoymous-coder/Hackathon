import java.util.*;
class solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row = 0 , col = 0;									//row and column variables
		int sum = 0;
		System.out.println("Enter the row size and column size of the array");
		row = sc.nextInt();
		col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter array elements");			
		for(int i=0;i<row;i++)									//Take the vector/array elements
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The border array elements sum is:");
		for(int i=0;i<row;i++)									//Traverse through the 2D array elements 
		{
			for(int j=0;j<col;j++)
			{				
				if(i==0)										//Check wheather the array element is either at 0th pos 	
					sum+=a[i][j];
				else if(i==row-1)								//Or at the last pos. row - 1 since array index starts from 0
					sum+=a[i][j];
				else if(j==0)									
					sum+=a[i][j];
				else if(j==col-1)
					sum+=a[i][j];
			}
		}
		System.out.println(sum);
	}
}