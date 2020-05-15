package PatternProgramming;

public class Pattern10 {

	public static void main(String[] args) {
	 /*
		
			A			n=4
		       BBB
		      CCCCC
	             DDDDDDD

	 */
		
		int n = 5;
		
		//char a = 'a';	//ASCII 65
		
		int character_left = 65;
		
		int character_right = 65;
		
		for(int i=1; i<=n; i++)
		{
			for(int s=1; s<=n-i;s++)
			{
				System.out.print(" ");
			}
			
			for(int c=1; c<=i; c++)
			{
				System.out.print((char)character_left);
			}
			character_left++;
			
			for(int cr = 0; cr < i-1; cr++)
			{
				System.out.print((char)character_right);
			}
			character_right++;
			
			System.out.println();
		}

	}

}
