package PatternProgramming;
import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
	
	/*  
	        *
	       ***
	      *****
	 	 *******
	 	*********		n=5
	 	 *******
	 	  *****
		   ***
		    *
	*/	
		
		int n1 = 5;
		
		for(int i=1; i<=n1; i++)
		{	
			//space
			for(int j=0; j<n1-i; j++)
			{
				System.out.print(" ");
			}
			
			//first star
			for(int k=1; k<=i;k++)
			{
				System.out.print("*");
			}
			
			//second star
			for(int l=0; l<i-1; l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		

		int n = 5;
		
		//make second part one row less.
		for(int i=n-1; i>0; i--)
		{	
			//space
			for(int k=0; k<n-i; k++)
			{
				System.out.print(" ");
			}
			
			//first part of star
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			
			//second part of star
			for(int f=1; f<i; f++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	}

}
