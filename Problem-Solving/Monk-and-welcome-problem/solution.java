/*
Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C such that:
;


Now, Monk will proceed further when you solve this one. So, go on and solve it :)

Input:
First line consists of an integer N, denoting the size of A and B.
Next line consists of N space separated integers denoting the array A.
Next line consists of N space separated integers denoting the array B.

Output:
Print N space separated integers denoting the array C.
*/
import java.util.*;

class solution
{
 public static void main(String args[])
 {
  solution obj = new solution();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array");
  int N = sc.nextInt();
  int A[] = new int[N];
  int B[] = new int[N];  

  System.out.println("Enter elements of array1 ");
  for(int i=0;i<N;i++)
  { 
    A[i] = sc.nextInt();  
  }
  System.out.println("Enter elements of array2 ");
  for(int i=0;i<N;i++)
  { 
    B[i] = sc.nextInt();
    B[i] = B[i] + A[i];  
  }
  System.out.println("The addition of ar1 and ar2 is");
  for(int i=0;i<N;i++)
  {
   System.out.print(B[i] + " ");
  }
 }
}
  
  
