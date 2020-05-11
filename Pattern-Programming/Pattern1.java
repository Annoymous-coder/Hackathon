package PatternProgramming;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
	
	/*
		*			n=6
		**
		***
		****
		*****
		******
	*/	
		
		int n = 6;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
