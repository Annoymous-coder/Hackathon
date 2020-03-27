package practice;
import java.util.*;
import java.lang.Math;

public class rotateSqMatrix {
	
	public void rotateSqMatrixClockWise(int[][] mat, int n) {
		// TODO Auto-generated method stub
		int temp[][] = new int[n][n];
		for(int x=0;x < Math.floor(n/2); x++)
		{
			for(int y=x; y<n-x-1; y++)
			{
						temp[x][y] = mat[x][y];			
			            mat[x][y] = mat[y][n-1-x]; 		
			            mat[y][n-1-x] = mat[n-1-x][n-1-y];	    
			            mat[n-1-x][n-1-y] = mat[n-1-y][x]; 		 		          
			            mat[n-1-y][x] = temp[x][y];
			            display(mat,n);
			            System.out.println();
			}
		}
		//display(mat,n);
	}	
	public void transpose(int [][]mat, int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n-i-1;j<n;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{	
					System.out.println("i="+i+" j="+j);
					int temp = mat[j][i];
					mat[j][i] = mat[i][j];
					mat[i][j] = temp;
				}
				display(mat,n);
	            System.out.println();
			}
		}
	}
	public void display(int[][] mat, int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}				
	 }	
	
	 	
   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		rotateSqMatrix obj = new rotateSqMatrix();
		int N = 3;
		
		int mat[][] = new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		//obj.rotateSqMatrixClockWise(mat,N);
		obj.transpose(mat, N);

	}

}
