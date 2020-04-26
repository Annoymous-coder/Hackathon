//Found at InterviewBit https://www.interviewbit.com/problems/seats/ And At LeetCode as Minimum-Number-Of-Jumps
//Asked by WalMart
//The approach is to first find out the number of occupied seats and put it on rightCount
//While leftCount is still there at 0
//There are 3 cases here to be considered
//1.If the occupied seats are 0 then nothing to move , return 0
//2.if the current char is not a occupant then add the min of left and right count.
//Example here ..X..XX...XX here lc = 0 and rc = 4, so if at i=0 add 0 to noOfMoves. Same for i=1.
//3.If the current char is the occupant then increment both lc and rc.

//Going through all the iterations we find the working of these two pointer method

//First add the no of occupants present
//here rc = 4

//i=0
//lc = 0
//moves = 0 = lc

//i=1
//lc = 0
//moves = 0 = lc

//i=2
//lc = 0
//moves = 0 = lc

//i=3
//lc = 0
//moves = 0 = lc

//i=4
//lc=1 , rc = 3

//i=5
//lc=1 , rc = 3
//moves = 1

//i=6
//;c = 1, rc = 3
//moves = 1 + 1 = 2

//i=7
//lc = 2, rc = 2

//i=8
//lc = 3, rc = 1

//i=9
//lc = 3 , rc = 1
//moves = 2 + 1(rc) = 3

//i=10
//lc = 3 , rc = 1
//moves = 3 + 1(rc) = 4

//i=11
//lc = 3 , rc = 1
//moves = 4 + 1(rc) = 5

//i=12
//lc = 4 , rc = 0 

//i=13
//lc = 4 , rc = 0
//moves = 5 + 0

//i=14
//lc = 4 , rc = 0
//moves = 5 + 0


package practice;
import java.util.*;
public class Seats {
	
	public int getSeats(String s)
	{	
		int moves = 0, leftCount = 0, rightCount = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'X') {
				rightCount++;
			}
		}
		for(int i=0; i<s.length(); i++)
		{
			if(rightCount==0) break;
			else if(s.charAt(i)=='X')
			{
				leftCount++;
				rightCount--;
			}
			else
			{
				moves+=Math.min(leftCount, rightCount);
			}
		}
		return moves;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "....X..XX...X..";
		Seats obj = new Seats();
		System.out.println("Minimum moves to be made for adjacent is "+ obj.getSeats(s));
	}

}
