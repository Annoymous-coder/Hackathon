package practice;
import java.util.*;

public class unionOfTwoArray {

	public void getUnion(int A[], int B[])
	{
		int maxLength = 0;
		if(A.length > B.length) maxLength = A.length;
		else maxLength = B.length;
		
		int C[] = new int[maxLength];
		
		for(int i=0;i<A.length;i++)
		{	
			for(int j=0;j<B.length;j++)
			{  
				System.out.println("A[i]=" + A[i] + " B[j]="+B[j]);
				if(A[i]==B[j] && isPresent(A[i],C)==false)
				{
					C[i] = A[i];					
				}	
				
			}	
		}
		for(int i=0;i<C.length;i++)
		{
			System.out.println(C[i]);
		}		
	}
	public Boolean isPresent(int a, int C[])
	{
		Boolean flag = false;
		for(int i=0;i<C.length;i++)
		{   
			if(a==C[i]) flag = true;
			else flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		unionOfTwoArray obj = new unionOfTwoArray();
		Scanner sc = new Scanner(System.in);
		int A[] = {1,2,3,4,6,6,4};
		int B[] = {1,1,4,4};
		
		obj.getUnion(A,B);
		
		sc.close();
	}

}
