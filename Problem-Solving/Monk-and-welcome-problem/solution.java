import java.util.*;

class solution
{
 public void add(int N,int A[],int B[])
 {
  int C[] = new int[N];
  for(int i=0;i<N;i++)
  {
   C[i] = A[i] + B[i];
   System.out.print(C[i] + " ");
  }
 }
 public static void main(String args[])
 {
  solution obj = new solution();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array");
  int N = sc.nextInt();
  int A[] = new int[N];
  int B[] = new int[N];  

  System.out.println("Enter elements of array1 and array2");
  for(int i=0;i<N;i++)
  {
    A[i] = sc.nextInt();
    B[i] = sc.nextInt();
  }
 
  System.out.println("The addition of ar1 and ar2 is");
  obj.add(N,A,B);
 }
}
  
  
