//THIS PROGRAM DOES NOT GIVE THE ACTUAL ANSWER BUT A TEMPLATE OF IT.
//RETURNS THE DIFFERENT NO OF CHARACTERS PRESENT IS THE STRING. 
///BUT HAVE TO RETURN A LIST OF NO CONTAINING THEIR REPETETION SEQUENCE.

package practice;

import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.standard.Compression;

public class test {

	public static void main(String args[])
	{
		int counter = 0;
		String str = "accccccd";
		HashSet <Character> set = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(set.contains(ch))
			{
				continue;
			}
			else
			{
				set.add(ch);
				counter++;
			}
		}
		System.out.println(counter);
		
	}
}
