package PatternProgramming;

import java.io.CharConversionException;

public class Pattern11 {

	public static void main(String[] args) {
	 /*
		n=5
		
		ABCDEEDCBA
		ABCD  DCBA
		ABC    CBA
		AB	BA
		A        A

	 */
		
		int n = 5;
		
		int character_left = 65;
		int character_right = 65+n-1;
		
		for(int i = n; i>=1; i--)
		{	
			//Left hand side of character.
			//Initialize ch_left to 'A' then increment for every iteration, after which reset back to 'A'
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)character_left);
				character_left++;
			}
			character_left = 65;
			
			//Space: 
			//Since the space goes in the pattern of 0,2,4,6,8...
			//Find limiter till 4.
			//Since i is traversing from 5 to 1, we can make use of it.
			//When i=5, n=5 so n-i gives = 0 = 2*0 = 0
			//i=4,n=5, gives 1 so n-i gives = 1 = 2*1 = 2
			//i=3,n=5, gives 1 so n-i gives = 2 = 2*2 = 4
			//i=2,n=5, gives 1 so n-i gives = 3 = 2*3 = 6
			//i=1,n=5, gives 1 so n-i gives = 4 = 2*4 = 8
			//We found the required number of zeroes for each row.
			for(int s=0; s<2*(n-i); s++)
			{
				System.out.print(" ");
			}
			
			//Right hand side of character.
			//Initialize ch_right to 'E' then decrement for every iteration, after which reset back to 'E'
			for(int k=1; k<=i; k++)
			{
				System.out.print((char)character_right);
				character_right--;
			}
			character_right = 65+n-1;

			System.out.println();
		}
		
	}

}
