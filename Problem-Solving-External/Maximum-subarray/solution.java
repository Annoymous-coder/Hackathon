class Solution {
    public int maxSubArray(int[] nums) {
	// ans is the final result and currentsum is the sum of current window
        int ans = 0, currentsum = 0;
	//intialize the current window to the first element also the final ans
        currentsum = ans = nums[0];
        for(int i=1;i<nums.length;i++)
        {   
	    //if the number at pos i > than the existing res then update the current sum
            if(currentsum + nums[i] > nums[i])
            {
                currentsum+=nums[i];
            }
	    //else change the window starting pos to the current element since the result is to be contingous.
            else
            {
                currentsum = nums[i];
            }
	    //update largest result after every iteration.
            ans = Math.max(ans,currentsum);
        }
        return ans;
    }
}