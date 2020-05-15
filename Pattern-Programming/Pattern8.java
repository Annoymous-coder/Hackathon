package PatternProgramming;

public class Pattern8 {

	public static void main(String[] args) {
	 /*
		1		n=4
		12
		123
		1234

	 */
		
		int n = 4;
		int ele = 1;
		
		//Since no of rows is 4. Iterate 4 times from 1 to 4. (1 based indexing is used to make it easier for relative indexing)
		for(int i=1; i<=n; i++)
		{	
			//For first array print one ele, 2nd row two elements so it is dependent on i.
			for(int j=1; j<=i; j++)
			{
				System.out.print(ele);
				ele++;
			}
			ele = 1;	//Each time the inner for loop is completed reset ele to 1
			System.out.println();		//Print new line after inner loop is done
		}

	}

}
