package practice;

import java.util.*;

class try1
{
 public void doTranspose(int N,int M,int A[][])
 {
   int B[][] = new int[M][N];
   for(int i=0;i<N;i++)
   {
    for(int j=0;j<M;j++)
     { 
       System.out.println("i="+i+" j="+j);
       B[j][i] = A[i][j];
       display(B,N,M);
     }
    }
  }
  public void display(int [][]B, int N, int M)
  {
	  for(int i=0;i<M;i++)
	   {
	    for(int j=0;j<N;j++)
	     {
	       System.out.print(B[i][j]+"\t");
	     }
	    	System.out.println();
	    }
  }
 public static void main(String args[])
 { 
   Scanner sc = new Scanner(System.in);
   int N,M;
   System.out.println("Enter row size(N) and column size(M)");
   N = sc.nextInt();
   M = sc.nextInt();
   int A[][] = new int[N][M];
   System.out.println("Enter the matrix to be transposed");
   for(int i=0;i<N;i++)
   {
     for(int j=0;j<M;j++)
     {
       A[i][j] = sc.nextInt();
     }
   }
  try1 obj = new try1();
  System.out.println("Transposed Matrix");
  obj.doTranspose(N,M,A);
 }
}

 
