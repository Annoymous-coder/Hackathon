package practice;

public class ascendingOrder {
	
	public boolean ascending(int a[])
	{	boolean flag = false;
		for(int i=0;i<a.length-1;i++)
		{	System.out.println(a[i]);
			if(a[i]<=a[i+1]){
				flag = true;
				//continue;
			}
			else
			{
				return false;
			}
			
			System.out.println(flag);
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,2,2,3,4,4,5,6,7,8,9};
		ascendingOrder obj = new ascendingOrder();
		System.out.println("is it ascending ordered " + obj.ascending(a));
	}

}
