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
import java.util.Arrays;
class solution1
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
         //This is the correct solution. The way to do is that the smallest number in the array takes more time in getting greater than or equal to k. Since we have to find the count in which this updation happens, we can get that answer by subtracting the largest ele with smallest ele where we get what is the count required to reach the max element.
//There is one corner case if the K is less than A{0] i.e the smallest element then the count should be zero.
         Arrays.sort(A);
         int temp = A[0];
         int ans = 0;
         if(K<A[0])
         {
           ans = 0;
           System.out.println(ans);
         }
	 else
	 {
           ans = K - temp;
           System.out.println(ans);
         }
         
         T--;
        
       }
  }
}

