package practice;
import java.util.*;
public class SpiralMatrix {
	
	//Print matrix in spiral order.
	public static void main(String[] args) {
		
		int nums[][] = {
				
			   
		  /*T*/ {1, 2, 3},
				{4, 5, 6},
		  /*B*/	{7, 8, 9}
		       /*L*/ /*R*/
		};
		int T = 0, B = nums.length - 1;
		int L = 0, R = nums[0].length - 1;
		
		//0->right, 1->bottom, 2->left, 3->up
		int dir = 0;
		
		while(T<=B && L<=R)
		{
			if(dir == 0)
			{
				for(int i=L; i<=R; i++)
					System.out.print(nums[T][i] + " ");
				T++;
				dir = 1;
			}
			if(dir == 1)
			{
				for(int i=T; i<=B; i++)
					System.out.print(nums[i][R] + " ");
				R--;
				dir = 2;
			}
			if(dir == 2)
			{
				for(int i=R; i>=L; i--)
					System.out.print(nums[B][i] + " ");
				B--;
				dir = 3;
			}
			if(dir == 3)
			{
				for(int i=B; i>=T; i--)
					System.out.print(nums[i][L] + " ");
				L++;
				dir = 0;
			}
			
		}
		
	}

}
