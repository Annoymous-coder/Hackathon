/*
Due to the demonetization move, there is a long queue of people in front of ATMs. Due to withdrawal limit per person per day, people come in groups to withdraw money. Groups come one by one and line up behind the already present queue. The groups have a strange way of arranging themselves. In a particular group, the group members arrange themselves in increasing order of their height(not necessarily strictly increasing).

Swapy observes a long queue standing in front of the ATM near his house. Being a curious kid, he wants to count the total number of groups present in the queue waiting to withdraw money. Since groups are standing behind each other, one cannot differentiate between different groups and the exact count cannot be given. Can you tell him the minimum number of groups that can be observed in the queue?

*/
import java.util.*;
class solution
{
 void findGrp(int n,int A[])
 { 
   int count = 1;
   for(int i=1;i<n;i++)
   {
     if(A[i] >= A[i-1])
        continue;
     else 
        count = count + 1;
    }
   System.out.println(count);

 }
 
 public static void main(String args[])
 {
  solution obj = new solution();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the positve integer n : The no of persons incoming");
  int n = sc.nextInt();
  int A[] = new int[n];
  System.out.println("Enter the height of each person");
  for(int i=0;i<n;i++)
  {
    A[i] = sc.nextInt();
  }
  System.out.println("The minimum no of groups present are");
  obj.findGrp(n,A);
 }
}














