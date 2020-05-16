package PatternProgramming;

import java.io.CharConversionException;

public class Pattern15 {

	public static void main(String[] args) {
	 /*
	  	Sandglass
	  	
		* * * * * 
		 * * * * 
		  * * * 
		   * * 
		    * 
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 
		
		  n=5
		
	 */
		
		int n = 5;
		
		//above
		for(int i=1; i<=5; i++)
		{	
			//space
			for(int s=1; s<i; s++)
			{
				System.out.print(" ");
			}
			
			//star
			for(int j=n; j>=i; j--)
			{
				//No space=right angled triangle, withspace updside-down equilateral triangle
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}
		
		//bottom-half
		for(int i=1; i<=n; i++)
		{
			//space
			for(int s=1; s<=n-i; s++)
			{
				System.out.print(" ");
			}
			//star
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
}
