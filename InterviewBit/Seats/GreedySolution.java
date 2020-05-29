//Found at https://www.interviewbit.com/problems/seats/
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
package practice;

import java.util.*;

public class Seats {

	public int getSeatsMethod2(String s) {
		int no_of_seats = 0;
		// count the number of persons present
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'X') {
				no_of_seats++;
			}
		}

		// seat position will hold the positions in which the persons are
		// sitting
		int seat_position[] = new int[no_of_seats];

		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'X') {
				// add the persons positions into the array, -1 since based on 0
				// based indexing
				seat_position[j++] = i - 1;
			}
		}

		// calculate the mid positions of new array and the given array
		int mid_positon = (int) (seat_position.length / 2);
		int center_positon = (int) (s.length() / 2);

		// source is their original position, destination is the place they need
		// to go
		int source = 0, destination = 0, jumps = 0;

		// Assume these two arrays.
		// seat-position array
		// index 0 1 2 3
		// value 3 6 7 11

		// original array
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		// . . . x . . x x . . . x . .

		// here mid_position is 1 and center_position is 6.
		// we need to place all the persons left and right of mid to adjacent to mid
		// traverse through the position array and calculate souce and destination
		// destination when i=0, 6-1+0 = 5. The element at position 3 must go to position 3
		// so subtract abs(5-3) to get the jump value to 2.

		for (int i = 0; i < seat_position.length; i++) {
			destination = center_positon - mid_positon + i;
			source = seat_position[i];
			jumps = jumps + Math.abs(destination - source);
		}
		return jumps;
	}

	public static void main(String[] args) {

		String s = "....X..XX...X..";
		// ".......X......."
		Seats obj = new Seats();
		System.out.println("Minimum moves to be made for adjacent is "
				+ obj.getSeatsMethod2(s));
	}

}
