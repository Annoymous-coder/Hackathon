package PatternProgramming;

public class Pattern5 {

	public static void main(String[] args) {
	 /*
			*				n=5
		   ***
		  *****
		 *******
		*********

	 */
		
		int n = 5;
		
		for(int i=1; i<=n; i++) {
			
			//space
			for(int s=1; s<=n-i; s++)
			{
				System.out.print(" ");
			}
			
			//first part of star
			for(int g=1; g <= i; g++)
			{
				System.out.print("*");
			}
			
			//second part of star
			for(int d = 1; d<i; d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
