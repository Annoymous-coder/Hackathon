//TOP-DOWN APPROACH USING RECURSION

package practice;

public class HouseRobber {

	public int rob(int[] nums, int i) {
		if (i < 0)
			return 0;
		else
			return Math.max(nums[i] + rob(nums, i - 2), rob(nums, i - 1));
	}

	public static void main(String[] args) {

		HouseRobber obj = new HouseRobber();
		int nums[] = { 1, 2, 3, 1 };
		System.out.println("The max amt is " + obj.rob(nums, nums.length - 1));
	}

}

//EXPLANATION
//SINCE THIS IS A TOP DOWN APPROACH, WE START FROM THE LAST NUMBER.
//WE CAN MAKE 2 CHOICES.
//A] TO ROB THE CURRENT HOUSE
//B] NOT TO ROB THE CURRENT HOUSE
//-> A] IF THE CURRENT HOUSE IS ROBBED THEN THE PREVIOUS HOUSE CANNOT BE ROBBED., BUT THE HOUSES PREVIOUS TO IT CAN i.e I-2.
//-> B] IF THE CURRENT HOUSE IS NOT ROBBED THEN , THE PREVIOUS HOUSE CAN BE ROBBED i.e I-1.

//TRACING
//[0 1 2 3]
//[1 2 3 1]
//START FROM INDEX 3

//FIRST DECIDE TO ROB ALL THE CURRENT HOUSES i.e nums[i] + rob(nums, i-2)
//max( [1 + [2 + [0 ( since i < 0 )] ] ] )

//DECIDE NOT TO ROB THE CURRENT HOUSES i.e rob(nums, i-1)
//max[ [3 + [1] ] ]