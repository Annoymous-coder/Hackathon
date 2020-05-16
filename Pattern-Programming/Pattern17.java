package PatternProgramming;

import java.io.CharConversionException;

public class Pattern17 {

	public static void main(String[] args) {
	 /*
		   1
		  212
		 32123
		4321234
		 32123
		  212
		   1
		
		  n=4
		
	 */
		
		int n = 4;
		int ele = n;
		
		for(int i=1; i<=n; i++)
		{
			//space
			for(int s=1; s<=n-i; s++)
			{
				System.out.print(" ");
				ele--;
			}
			
			//number in left starting row 2 to 4
			for(int j=1; j<i; j++)
			{
				System.out.print(ele);
				ele--;
			}
			ele=n;
			
			for(int k=1; k<=i; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		//botttom
		
		for(int i=1; i<n; i++)
		{
			for(int s=1; s<=i; s++)
			{
				System.out.print(" ");
				ele--;
			}
			
			for(int j=1; j<n-i; j++)
			{
				System.out.print(ele);
				ele--;
			}
			ele=n;
			
			for(int k=1; k<=n-i; k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
}
