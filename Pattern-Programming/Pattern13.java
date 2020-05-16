package PatternProgramming;

import java.io.CharConversionException;

public class Pattern13 {

	public static void main(String[] args) {
	 /*
	  	Pascals Right Triangle
	  	
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 	
		* 
		
		n=5
		
	 */
		
		int n = 5;
		
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
