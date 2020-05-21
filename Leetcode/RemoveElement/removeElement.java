package practice;

public class RemoveElement {

	public static void main(String[] args) {
		
		//Given an array , remove all occurrences of the given remove element.
		//No extra array can be used, but can be rearranged.
		int nums[] = { 4,1,2,3,5 };
		int remove = 4;

		// method1; Involves un-necessary shifting towards left when remove
		// elements are rare
		// Ex: [1,2,3,4] and remove = 4, So have to copy all elements from 1 to
		// 3 unnecessarily.
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != remove) {
				nums[j++] = nums[i];
			}
		}
		//But this method is stable, since the order of array is preserved.
		for(int i=0; i<j; i++)
			//Output [1,2,3,5]
			System.out.print(nums[i] + " ");
		
		
		// Method2;
		/*
		 * Approach 2: Two Pointers - when elements to remove are rare
		 * 
		 * Intuition
		 * 
		 * Now consider cases where the array contains few elements to remove.
		 * For example, nums=[1,2,3,5,4],val=4nums = [1,2,3,5,4], val =
		 * 4nums=[1,2,3,5,4],val=4. The previous algorithm will do unnecessary
		 * copy operation of the first four elements. Another example is
		 * nums=[4,1,2,3,5],val=4nums = [4,1,2,3,5], val =
		 * 4nums=[4,1,2,3,5],val=4. It seems unnecessary to move elements
		 * [1,2,3,5][1,2,3,5][1,2,3,5] one step left as the problem description
		 * mentions that the order of elements could be changed.
		 * 
		 * Algorithm
		 * 
		 * When we encounter nums[i]=valnums[i] = valnums[i]=val, we can swap
		 * the current element out with the last element and dispose the last
		 * one. This essentially reduces the array's size by 1.
		 * 
		 * Note that the last element that was swapped in could be the value you
		 * want to remove itself. But don't worry, in the next iteration we will
		 * still check this element.
		 */

		int nums2[] = { 4, 1, 2, 3, 5 };
		int remove2 = 4;

		int low = 0;
		int high = nums2.length - 1;

		while (low <= high) {
			if (nums2[low] == remove2) {
				nums2[low] = nums2[high];
				high--;
				// The low pointer will be in same position since we do not know,
				// if the swapped element is the one we are looking out or not
				// so, it will check same element again in next iteration.

			} else
				low++;
		}
		//This method is unstable, since the order is not preserved.
		for (int i = 0; i <= high; i++)
			//Output [ 5,1,2,3 ]
			System.out.print(nums2[i] + " ");
	}

}
