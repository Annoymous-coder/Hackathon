package practice;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		// set to true
		int flag = 0; 
		
		// 2 is the only even prime number. A number cannot be prime if its
		// divisible by any other number except one and itself.
		if (number < 2)
			flag = 1;
		else if (number > 2 && number % 2 == 0)
			flag = 1;
		else if (number > 2 && number % 2 != 0) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					flag = 1;
				}
			}
		}
		if (flag == 1)
			System.out.println("False : Not a prime number");
		else
			System.out.println("True : Prime number");
	}

}
