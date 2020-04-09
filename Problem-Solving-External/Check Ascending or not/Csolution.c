#include<stdio.h>

int checkAsc(int a[], int n)
{	
	int flag = 0;		//true
	for(int i=1;i<=n;i++)
	{	
		if(a[i] < a[i-1]) {

			flag = 1;	//false 
		}
	}
	return flag;	
}
void main()
{

	int a[5];
	int n = 5;

	printf("enter array elements to check if the order is ascending or not \n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	if(checkAsc(a,n) == 0) {
		printf("ascending order\n");
	}
	else {
		printf("not ascending order\n");
	}

}