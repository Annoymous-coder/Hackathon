#include<stdio.h>

int maxSubArrayOfSizeK(int a[], int n, int k)
{	
	int Wmax = 0;
	int globalMax = 0;


	/*for(int i=0;i<n-k+1;i++)			Naive` Silution; RunTime O(n * n)
	{	
		Wmax = 0;

		for(int j=i;j<k+i;j++)
		{
			Wmax = Wmax + a[j];	
		
			if(Wmax > globalMax) 
			{	
				globalMax = Wmax;

			}	
		}
	}

	return globalMax;*/


	for(int i=0;i<k;i++)
	{
		Wmax = Wmax + a[i];
	}
	for(int j=k;j<n;j++)
	{
		Wmax = Wmax + a[j] - a[j-k];

		if(Wmax > globalMax) globalMax = Wmax;

	}
	return globalMax;
}

void main()
{	
	int n;
	printf("Enter n:\n");
	scanf("%d",&n);

	int a[n];
	printf("Enter the array elements\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}

	int k;
	printf("Enter the window size(K)\n");
	scanf("%d",&k);

	printf("The maximum subarray sum is : %d\n" , maxSubArrayOfSizeK(a,n,k));
}