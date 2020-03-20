
package practice;
import java.util.Scanner;
import java.util.*;
class armstrong {
	
	 int countOfNum(int num)
	 {  
		return (int) ((Math.floor(Math.log10(num)+1)));
	 }
	 
	 void computeAndDisplay(int num)
	 {
		 int result = 0, temp = 0, length = 0, unit = 0;
		 length = countOfNum(num);
		 
		 temp = num;
		 
		 while(temp!=0)
		 {
			 unit = temp%10;
			 result = (int) (result + Math.pow(unit,length));
			 temp = (int)temp/10;
		 }
		 if(result == num)
		 {
			 System.out.println("Armstrong no");
		 }
		 else
		 {
			 System.out.println("not a armstrong no");
		 }
	 }
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		armstrong obj = new armstrong();
		
	 	System.out.println("Enter number to check whether it is Armstrong or not:");
		int num = sc.nextInt();
		
		obj.computeAndDisplay(num);
		
		
	}
}