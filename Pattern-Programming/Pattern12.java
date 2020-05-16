package PatternProgramming;

import java.io.CharConversionException;

public class Pattern12 {

	public static void main(String[] args) {
	 /*
	  
		1
		11
		121
		1231
		12341
		123451
		
		n=5
		
	 */
		
		int n = 5;
		int ele = 1;
		
		//method1
		/*for(int i=0; i<=n; i++)
		{	
			//1<=0 is false so prints 1 in the 1st iteration
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}

			
			System.out.print("1");
			
			System.out.println();
		}*/
		
		System.out.println("1");
		
		for(int i=1; i<=n; i++)
		{	
	
			for(int j=1; j<=i; j++)
			{
				System.out.print(ele);
				ele++;	
			}
			ele = 1;
			
			System.out.print("1");
			
			System.out.println();
		}
	}
}
