package practice;
import java.util.*;
public class SortTheNamesInAlphabeticalOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names to be sorted");
		int count = sc.nextInt();
		
		System.out.println("Enter the names to be sorted");
		String names[] = new String[count];
		sc.nextLine();
		for(int i=0; i<count; i++)
		{
			names[i] = sc.nextLine();
		}
		sc.close();
		
		//Sort the names using compareTo operator which compares every bit of the string.
		for(int i=0; i<count; i++)
		{
			for(int j=i+1; j<count; j++)
			{
				if(names[i].compareToIgnoreCase(names[j]) >0 ) 
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		for(String ele : names)
			System.out.println(ele);
	}

}
