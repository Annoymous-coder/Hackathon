package practice;
import java.util.*;
class ll
{
	void Decode(String code)	
	{
		char codeArray[] = code.toCharArray();
		int len = codeArray.length;
		int position[] = new int[2];
	
		
		for(int i=0;i<len;i++)
		{
			if(codeArray[i]=='L')
			{
				position[0] = position[0] - 1;
			}
			if(codeArray[i]=='R')
			{
				position[0] = position[0] + 1;
			}
			if(codeArray[i]=='D')
			{
				position[1] = position[1] - 1;
			}
			if(codeArray[i]=='U')
			{
				position[1] = position[1] + 1;
			}
		  }
		for(int j=0;j<2;j++)
		{
		  System.out.println(position[j]);
		}
		
		
	}
	
	public static void main(String args[])
	{
	 ll callme = new ll();	
	 Scanner sc = new Scanner(System.in);
	 //System.out.println("enter the code");
	 //String code = sc.nextLine();
	 
	 System.out.println("the final destination to be reached is");
	 callme.Decode("LLDRR");
	}
}
