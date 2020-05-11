package PatternProgramming;

public class Pattern3 {

	public static void main(String[] args) {
		
	/*	
		*****	n=5
		 ****   
		  ***   
		   **	
		    *   

	*/	
		
		int n = 5;
		
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			for(int k=0; k<=n-i; k++)
			{
				System.out.print(" ");
			}
		}	
	 
	}

}
