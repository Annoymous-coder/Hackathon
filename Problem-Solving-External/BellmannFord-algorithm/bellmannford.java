package practice;

import java.util.Scanner;

public class bellmannford {

	static int n;
	int a[][];
	int d[];
	int s;
	int p[];
	public final static int infty = 999;
	public bellmannford(int n) {
		// TODO Auto-generated constructor stub
	this.n = n;
	a = new int[n][n];
	d = new int[n];
	p = new int[n];
	}
	
	void bellmannford()
	{
	 for(int i=0;i<n;i++)
	 {
		 d[i]=a[s][i];
		 p[i]=a[s][i]==infty?-1:s;
	 }
	 p[s]=-1;
	 for(int i=0;i<n-1;i++)
	 {
		 for(int u =0;u<n;u++)
		 {
			 for(int v=0;v<n;v++)
			 {
				 if(d[v]>d[u]+a[u][v])
				 {
					 d[v]=d[u]+a[u][v];
					 p[v]=u;
				 }
			 }
		 }
	 }
	 }
	void input(int n)
	{   Scanner scanner = new Scanner(System.in);
		System.out.println("enter graph");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]= scanner.nextInt();
				if(i!=j && a[i][j]==0)
					a[i][j]=infty;
			}
		}
		System.out.println("enter source vertex");
		s = scanner.nextInt();
	}
	
	void output()
	{   
		for(int i=0;i<n;i++)
		{
		System.out.println("d("+s+","+i+") ="+d[i]+"p");
		//path(i);
		System.out.println();
		}
	}
	void path(int v)
	{
		if(v==-1)
			return;
	    //path(p[v+1]);
		System.out.println(","+v);
	}
	public static void main(String args[])
	{ 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter n");
		n = scanner.nextInt();
		bellmannford bf = new bellmannford(n);
	    bf.input(n);
	    bf.bellmannford();
	    bf.output();
	}
	
}
