#include<stdio.h>

void findTargetIndex(int a[], int n, int target)
{
	int start = 0, end = n-1;

	while(start < end)
	{
		if(a[start] + a[end] == target)
		{
			printf("Start = %d\n", start);
			printf("End = %d\n", end);
		}
		if(a[start++] + a[end--] > target)
		{
			end--;
		}
		else if(a[start++] + a[end--] < target)
		{
			start++;
		}
	}
}

void main()
{
	printf("Enter the size of sorted array(N)\n");
	int n = 0;
	scanf("%d",&n);

	printf("Enter the array\n");
	int a[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}

	printf("Enter the target value\n");
	int target = 0;
	scanf("%d",&target);

	printf("The target indices are:\n");
	
	findTargetIndex(a,n,target);
	

} 