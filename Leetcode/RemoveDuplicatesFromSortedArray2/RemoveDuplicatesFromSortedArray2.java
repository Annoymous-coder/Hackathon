//THIS PROGRAM IS SCALABLE TO AT-MOST K ELEMENTS ALSO.
//CHANGE at_most TO K FOR ALLOWING K CONTIGOUS ELEMENTS.

package practice;
import java.util.*;

public class RemoveDuplicatesFromSortedArray2 {
	
	public static void main(String[] args) {
		
		//soorted elements only.
		int nums[] = { 1, 1, 1, 2};

		/*
		 * //Method 1 int i = 0; for (int n : nums) if (i < 2 || n > nums[i-2])
		 * nums[i++] = n;
		 */

		/*
		 * //Method 2 int j = 2; for(int i=2;i<nums.length;++i) {
		 * if(nums[i]!=nums[j-2]) nums[j++] = nums[i]; }
		 */

		// Here at most duplicates allowed is 2, can be scaled to N duplicates
		int at_most = 2;
		// Index pointer to new modified array.
		int j = 0;
		// Handle corner cases of size less than 2.
		if (nums.length <= 2)
			System.out.print("New length is " + nums.length);

		for (int i = 0; i < nums.length; i++) {
			// Since corner cases are handled above, blindly add first two
			// elements into same
			// modified array.
			// After filling first two elements check if the current element > 2
			// elements before the added array element.
			if (j < at_most || nums[i] > nums[j - at_most]) {
				nums[j++] = nums[i];
			}
		}

		// Print elements of original array only till j. SInce after j all
		// elements are same as original array.
		for(int i=0; i<j; i++)
			System.out.print(nums[i] + " ");
	}

}
