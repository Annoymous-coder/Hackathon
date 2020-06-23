package practice;

import java.util.*;
import java.lang.*;

public class StringClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter original string");
		String orginal_string = sc.nextLine();
		System.out.println("Enter substring");
		String substring_to_be_inserted = sc.nextLine();
		System.out.println("Enter position to be inserted");
		int position_to_be_inserted = sc.nextInt();

		StringBuffer buffer = new StringBuffer(orginal_string);
		buffer.insert(0, substring_to_be_inserted);

		System.out.println(orginal_string + " after insertion is "
				+ buffer.toString());

		sc.nextLine();
		System.out.println("Enter original string");
		String orginal_string2 = sc.nextLine();
		System.out.println("Enter number of charaters to be deleted");
		int char_count = sc.nextInt();
		System.out.println("Enter position to be deleted");
		int position_to_be_deleted = sc.nextInt();

		StringBuilder builder = new StringBuilder(orginal_string2);
		builder.delete(position_to_be_deleted, char_count);

		System.out.println(orginal_string2 + " after deletion is "
				+ builder.toString());

	}

}

// When sc.nextInt() is done, it does not take the /n which is line feed which gets consumed by the next sc.nextLine()
// In order to avoid such situations we add a dummy sc.nextLine().
// Line Feed - \n
// Carriage Return - \r