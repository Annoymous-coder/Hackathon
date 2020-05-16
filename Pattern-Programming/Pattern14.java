package PatternProgramming;

import java.io.CharConversionException;

public class Pattern14 {

	public static void main(String[] args) {
	 /*
	  	Pascals Left Triangle
	  	
		    *
		   **
		  ***
		 ****
		*****
		 ****
		  ***
		   **
		    *
		
		  n=5
		
	 */
		
		int n = 5;
		
		//first part: row 1 to 5
		for(int i=1; i<=n; i++)
		{
			//space
			for(int s=1; s<=n-i; s++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//second part(bottom from row 6
		for(int i=1; i<=n-1; i++)
		{
			//space
			for(int s=1; s<=i;s++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=n-1; j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
