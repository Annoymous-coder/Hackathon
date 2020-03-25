/*
Micro purchased an array A having N integer values. After playing it for a while, he got bored of it and decided to update value of its element. In one second he can increase value of each array element by 1. He wants each array element's value to become greater than or equal to K. Please help Micro to find out the minimum amount of time it will take, for him to do so.

Input:
First line consists of a single integer, T, denoting the number of test cases.
First line of each test case consists of two space separated integers denoting N and K.
Second line of each test case consists of N space separated integers denoting the array A.

Output:
For each test case, print the minimum time in which all array elements will become greater than or equal to K. Print a new line after each test case. 

*/
import java.util.*;
class solution
{
 public static void main(String args[])
  {

	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
	 
       while(T!=0)
       {
         int N = sc.nextInt();
         int K = sc.nextInt();
	 //N = NO OF ELEMENTS , K IS THE TARGET VALUE TO BE UPDATED
	 int A[] = new int[N];
         for(int i=0;i<N;i++)
         {
           A[i] = sc.nextInt();
         }
         int count = 0;
	  for(int i=0;i<N;i++)
	  {
           /* OR THIS IS ALSO A WAY 
           if(A[i] < K)
           {
             A[i]++;
             count++;
           }
            */
	   if(A[i] >= K)
             continue;
           else
            {
             A[i] = A[i]+1;
             count = count + 1;
            }
            
	  }
        for(int i=0;i<N;i++)
        {
         System.out.print(A[i] + " ");
        }
        T--;
        System.out.println();
        System.out.println(count);
       }
  }
}

