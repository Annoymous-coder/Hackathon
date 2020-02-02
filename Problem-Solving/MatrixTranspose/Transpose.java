import java.util.*;
class Transpose
{
 public void doTranspose(int N,int M,int A[][])
 {
   int B[][] = new int[N][M];
   for(int i=0;i<N;i++)
   {
    for(int j=0;j<M;j++)
     {
       B[i][j] = A[j][i];
       System.out.print(B[i][j]+" ");
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
  Transpose obj = new Transpose();
  System.out.println("Transposed Matrix");
  obj.doTranspose(N,M,A);
 }
}

 
