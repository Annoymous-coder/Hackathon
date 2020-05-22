//BOTTOM-UP APPROACH USING TWO VARIABLES ITERATIONS

package practice;

public class HouseRobber {

	// Bottom-Up Using Two variables.
	public int rob(int[] nums) {
		int memo[] = new int[nums.length + 1];
		int prev2 = 0;
		int prev1 = nums[0];
		memo[0] = 0;
		memo[1] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int val = Math.max(nums[i] + prev2, prev1);
			prev2 = prev1;
			prev1 = val;
		}

		return prev1;
	}

	public static void main(String[] args) {

		HouseRobber obj = new HouseRobber();
		int nums[] = { 1, 2, 3, 1 };
		System.out.println("The max amt is " + obj.rob(nums));
	}

}

// EXPLANATION
// ADVANCED VERSION OF DYNAMIC APPROACH, USING TWO VARIABLES TO LESSEN THE SPACE
// COST.
// USUALLY DP ARRAY/ MEMO IS USED TO KEEP THE MAX TILL NOW, HERE USE TWO
// VARIABLES INSTEAD, SINCE THOSE TWO ARE THE VALUES WHICH ARE GOING TO CHANGE
// SINCE THIS IS A BOTTOM UP APPROACH, WE START FROM THE SECOND NUMBER.
// ADD 0 IF NO HOUSES, IF ONLY ONE HOUSE IS PRESENT THEN ROB IT. THESE ARE THE BASE CASES.
// WE CAN MAKE 2 CHOICES.
// A] TO ROB THE CURRENT HOUSE
// B] NOT TO ROB THE CURRENT HOUSE
// -> A] IF THE CURRENT HOUSE IS ROBBED THEN THE PREVIOUS HOUSE CANNOT BE
// ROBBED., BUT THE HOUSES PREVIOUS TO IT CAN i.e nums[i] + prev2.
// -> B] IF THE CURRENT HOUSE IS NOT ROBBED THEN , THE PREVIOUS HOUSE CAN BE
// ROBBED i.e prev1
