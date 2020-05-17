package PatternProgramming;
import java.io.CharConversionException;

public class Pattern19 {

	public static void main(String[] args) {
	 /*
	  ``FLOYD'S TRIANGLE PATTERN 
	  
		1
 
		2 3
		 
		4 5 6
		 
		7 8 9 10
		 
		11 12 13 14 15
		 
		16 17 18 19 20 21

		n = 6
		
	 */
		
		int n = 6;
		int ele = 1;
		
		for(int i=1; i<=n; i++)
		{	
			for(int j=1; j<=i; j++)
			{
				System.out.print(ele + " ");
				ele++;
			}
			
			System.out.println();
		}
		
	}

}


