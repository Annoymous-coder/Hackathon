package PatternProgramming;

public class Pattern9 {

	public static void main(String[] args) {
	 /*
		1		n=4
		22
		333
		4444

	 */
		
		int n = 4;
		int ele = 1;
		
		for(int i=1; i<=n; i++)
		{	
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(ele);
			}
			ele++;
			System.out.println();
		}

	}

}
