package practice;

public class SegregateEvenAndOddNumbers {

	// Dutch National Flag Sort Algorithm with two unknowns.
	// One of the shortcomings of this method is that when all elements are odd,
	// Endup swapping all elements present. So we modify the below algorithm
	// and swap only when required.
	public int[] segregatePlainDNF(int[] nums) {
		// low for Even Numbers and high pointer for Odd Numbers.
		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			if (nums[low] % 2 == 0) {
				low++;
			} else {
				int temp = nums[low];
				nums[low] = nums[high];
				nums[high] = temp;
				high--;
			}

		}

		return nums;
	}

	// Modified version of plain Dutch National Sort Algorithm.
	// Swap only when required.
	public int[] segregateModifiedDNF(int[] nums) {
		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			// Even comes first. So If number is even its in the right position
			// so move ahead.
			if (nums[low] % 2 == 0) {
				low++;
			}

			// If the number is odd(not even) at low.
			else {
				// Since the last number is supposed to be odd. So its in the
				// right position, so decrease sorting space.
				// nums[low] = odd, nums[high] = odd
				if (nums[high] % 2 == 1) {
					high--;
				}

				// if the last number is not odd, only then swap with element at
				// low.
				// nums[low] = odd, nums[high] = even
				else if (nums[high] % 2 != 1) {
					int temp = nums[high];
					nums[high] = nums[low];
					nums[low] = temp;
					// since we know the elements are swapped to their
					// respective places, confidently increase low and decrease
					// high for reducing search space
					high--;
					low++;
				}
			}
		}
		return nums;

	}

	// Put all the even elements first then all the odd elements.
	// Similar to remove duplicates, or remove a particular value.
	// In-Place segregation: This method is stable when compared to Dutch
	// National Sort Algorithms
	public int[] method2(int[] nums) {
		// New array to store the answer.
		int ans[] = new int[nums.length];

		// Pointer where the elements should go.
		int j = 0;
		// Put all the even elements first.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 1)
				ans[j++] = nums[i];
		}

		// Continue putting the odd elements next.
		// No need to worry, since jth index is maintained.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0)
				ans[j++] = nums[i];
		}

		return ans;
	}

	public static void main(String[] args) {

		SegregateEvenAndOddNumbers obj = new SegregateEvenAndOddNumbers();

		int nums[] = { 3, 2, 1, 5 };

		// obj.segregatePlainDNF(nums);

		obj.segregateModifiedDNF(nums);

		// int []ans = obj.method2(nums);

		for (int ele : nums)
			System.out.print(ele + " ");

	}

}
