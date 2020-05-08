package practice;

public class MoveAllZeroesTowardsEnd {

	public static void main(String[] args) {

		//int a[] = {0, 9, 0, 1, 0, 0, 4};
		//int a[] = {8, 9, 0, 1, 0, 0, 0};
		//int a[] = {0, 9, 0, 1, 0, 0, 0};  //This method is not stable for while-method.
		int a[] = {8, 9, 0, 1, 2, 0, 3};
		
		int start = 0;
		int end = a.length - 1;
		
		
		//Method1
		//Unstable method for test-case3
		//This method is just trial & error based on different inputs given.
		while(start < end) 
		{
			if(a[start] == 0 && a[end]!=0)
			{
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
			else if(a[start] !=0 && a[end] == 0)
			{
				end--;
			}
			else if(a[start] == 0 && a[end] == 0)
			{
				end--;
			}
			else if( a[start]!=0 && a[end]!=0)
			{
				start++;
			}	
			
		}

		//Mehthod2
		//Stable method.
		//makes use of two pointers one for zero ele and other for non-zero ele.
		//Keep j=0 and i = 1 
		//Traverse through entire array.If j ele is 0 and i ele is non-zero then swap b/w them.
		//if j ele is non zero then increase j;
		int j=0;
		for(int i=1; i<a.length; i++)
		{
			if(a[i]!=0 && a[j]==0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			else if(a[j]!=0)
			{
				j++;
			}
		}
		for(int ele : a)
			System.out.println("For-Method" + ele);
		
		for(int ele : a)
			System.out.println("While-Method" + ele);
	}
}
