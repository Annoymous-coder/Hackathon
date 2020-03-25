//Find the charged up array. If the array elements example 1,2,5 are present then the total charged array is given by , the total subsets by 1 2 5 is 2^N ie 8 and 1 occurs in 4 subsets similarly for 2 and 5. SO if 1 < 4 then it is not charged, 5 is charged since 5 > 4.Therefore total charged up value is 5.

import java.util.*;
import java.lang.Math;
class solution
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int T = sc.nextInt();
  int chargedUpArray = 0;
  while(T>0)
  {
   int N = sc.nextInt();
   int A[] = new int[N];
   for(int i=0;i<N;i++)
   {
     A[i] = sc.nextInt();
   }
   int totalSubsets = (int)Math.pow(2,N);
   int flag = totalSubsets / 2;
   //System.out.println(totalSubsets);
   for(int i=0;i<N;i++)
   {
     if(A[i]<flag)
     {
        chargedUpArray = 0;
     }
     else
     {
        chargedUpArray = chargedUpArray + A[i];
     }
   }
   System.out.println(chargedUpArray);
   T--;
  }
 }
}
  
