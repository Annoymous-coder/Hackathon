package PatternProgramming;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
	
	/*  
	 	*********		n=5
	 	 *******
	 	  *****
		   ***
		    *
	*/	
		
		int n = 5;
		
		for(int i=n; i>0; i--)
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
