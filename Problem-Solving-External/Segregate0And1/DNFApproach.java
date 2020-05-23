package practice;

public class Segregate0And1 {

	// Dutch National Flag Sort Algorithm with two unknowns.
	public int[] segregate(int[] nums) {
		// low for 0 and high pointer for 1.
		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			if (nums[low] == 0) {
				low++;
			} else if (nums[low] == 1) {
				nums[low] = nums[high];
				nums[high] = 1;
				high--;
			}
		}

		return nums;
	}

	public static void main(String[] args) {

		Segregate0And1 obj = new Segregate0And1();

		int nums[] = { 1, 0, 1 };

		obj.segregate(nums);

		for (int ele : nums)
			System.out.print(ele + " ");

	}

}
