



class PalindromeChecker
{
	public static void main(String args[])
	{
		String s = "malayalam";
		String flag = "False";
		int low = 0;
		int high = s.length()-1;
		while(low<high)
		{
			if(s.charAt(low)!=s.charAt(high))
			{
				System.out.println("False");
				flag = "False";
			}
			else
			{
				System.out.println("True");
				flag = "True";
			}
			low++;
			high--;
		}
		System.out.println("FINAL RESULT: "+flag);
	}
}
