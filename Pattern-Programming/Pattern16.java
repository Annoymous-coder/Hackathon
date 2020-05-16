package PatternProgramming;

import java.io.CharConversionException;

public class Pattern16 {

	public static void main(String[] args) {
	 /*
	  	K shaped aplhabet
	  	
		A B C D E F 
		A B C D E 
		A B C D 
		A B C 
		A B 
		A 
		A 
		A B 
		A B C 
		A B C D 
		A B C D E 
		A B C D E F 
		
		  n=5
		
	 */
		
		int n = 6;
		int char_top = 65;
		
		//top-half
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<=n-i; j++)
			{
				System.out.print((char)char_top + " ");
				char_top++;
			}
			char_top=65;
			
			System.out.println();
		}
		
		//bottom-half
		int char_bottom = 65;
		
		for(int i=1; i<=n; i++)
		{
			for(int c=1; c<=i; c++)
			{
				System.out.print((char)char_bottom + " ");
				char_bottom++;
			}
			char_bottom = 65;
			System.out.println();
		}
		
	}
}
