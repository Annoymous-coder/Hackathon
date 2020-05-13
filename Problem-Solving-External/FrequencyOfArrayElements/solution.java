package practice;
import java.util.*;
import java.util.ArrayList.*;

class FrequencyOfArray
{
	public static void main(String args[])
	{
		int arr[] = {1,1,2,2,7,3,4,5,1};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.get(arr[i]) == null ? 1 : map.get(arr[i])+1);
		}
		System.out.println(map);
		
		//if already traversed make it negative 
		for(int i=0;i<map.size();i++)
		{
			if(map.get(arr[i]) != -1)
			{
				System.out.println(arr[i] + " " + map.get(arr[i]));	
				System.out.println(map);
				map.put(arr[i], -1);
			}
		}
		System.out.println(map);
	}
}
//THIS PROGRAM MAINTAINS THE ORDER OF THE INPUT WHILE DISPLAYING THE FREQUENCIES. i.e DONE BY MAKING THE VALUE -VE ONCE IT IS TRAVERSED.
//IF MAINTAINING THE ORDER OF INPUT IS NOT NECESSARY THEN WE CAN NEGLECT THE 2ND FOR LOOP PRESENT.
//LOGIC OF THIS METHOD IS TO TRAVERSE THROUGH THE ARRAY ONCE AND CHECK IF ITS ALREADY IN MAP, IF IT IS NOT THEN ADD IT AND MAKE THE FREQ = 1 , ELSE ADD IF ALREADY FOUND,
//THEN INCREASE THE FREQUENCY OF THAT ELEMENT BY ONE.
//IN THIS MAP THE KEY IS THE ELEMENT AND THE VALUE IS ITS FREQUENCY.