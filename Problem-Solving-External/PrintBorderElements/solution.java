import java.util.*;
class solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row = 0 , col = 0;
		System.out.println("Enter the row size and column size of the array");
		row = sc.nextInt();
		col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The border array elements are:\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{	
				if(i==0)
					System.out.print(a[i][j] + "\t");
				else if(i==row-1)
					System.out.print(a[i][j] + "\t");
				else if(j==0)
					System.out.print(a[i][j] + "\t");
				else if(j==col-1)
					System.out.print(a[i][j] + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}