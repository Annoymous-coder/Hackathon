package practice;
import java.util.Scanner;

public class PhilalandCoinProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number_of_test_cases = sc.nextInt();
		
		//Method 1;
		
		while (number_of_test_cases > 0)
		{

			int input_number = 0; //sc.nextInt();

			int no_of_denominations = 0;

			while (Math.pow(2, no_of_denominations) <= input_number) {
				no_of_denominations++;
			}

			System.out.println("The given amount can be represented using " +no_of_denominations+ " denominations");
			
			number_of_test_cases--;

		}
		
		//Method 2;
		
		while(number_of_test_cases-- > 0){
		
			int n = sc.nextInt();
			int count = 0;
			int flag = 0;
			for(int i=1; i<=n; i++)
			{
				if(count < n && i > count)
				{	
					count = count + i;
					flag++;
				}
			}
			System.out.println("The given amount can be represented using " +flag+ " denominations");
		}

	}

}
