package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import javax.print.attribute.standard.Compression;

public class test {

	public static void main(String args[])
	{
		int counter = 0;
		String str = "acdddd";
		int list[] = new int[str.length()];
		HashMap <Character,Integer> map = new HashMap <Character,Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(map.containsKey(ch))
			{
				//list[i] = map.get(ch);
				continue;
			}
			else
			{	
				map.put(ch, counter);
				counter++;
			}
		}
		for(int i=0; i<str.length();i++) {
	      for (Entry<Character, Integer> entry : map.entrySet())  
	      {
	    	char ch = str.charAt(i);
	    	if(ch == entry.getKey())
	    	{
	    		list[i] = entry.getValue();
	    	}
	      }
	      System.out.print(list[i] + " ");
		}
	}
}
//LOGIC OF THE PROGRAM IS TO FIND OUT THEIR POS EX. "ABCDDD" HERE A=1,B=2,C=3,D=4 SO OUTPUT IS 1 2 3 4 4 4
//WE CAN FIND THIS OUT BY USING MAP WHICH STORES THE NEW ELEMENT AND THEIR CORRESPONDING COUNTER VALUE
//USE THE CHARACTER AS KEY SINCE IT DOES NOT REPEAT AND COUNTER AS ITS VALUE
//TRAVERSE THROUGH THE GIVEN STRING AND CHECK IF THIS KEY EXISTS , SKIP THE LOOP, ELSE ADD THE COUNTER VAL INTIALLY AT 0, SO INCREMENT AFTER map.put(ch,counter)
//THEN TRAVERSET THOUGH THE STRING AS WELL AS THE KEYS OF THE MAP, IF THE KEY ANS STRING CHARACTER IS SAME THEN ADD ITS RESPECTIVE COUNTER VALUE TO THE LIST.
