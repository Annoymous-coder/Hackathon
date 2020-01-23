package practice;
import java.util.*;
public class infytq {
public static void main(String args[])
{
	String inp = "-1abc23abc4abcyu4678861";
	char a[] = inp.toCharArray();
	int n = a.length;
	char out[] = new char[n];
	

	for(int i = 0;i<a.length;i++)
	{
		if(a[i]=='-'||a[i]== '1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9')
		{
          out[i]=a[i];
		}
		
	}
	for(int i=0;i<out.length;i++)
		if(out[i]=='-'||out[i]== '1'||out[i]=='2'||out[i]=='3'||out[i]=='4'||out[i]=='5'||out[i]=='6'||out[i]=='7'||out[i]=='8'||out[i]=='9')
		{
			System.out.print(out[i]);
		}
	
}
}
