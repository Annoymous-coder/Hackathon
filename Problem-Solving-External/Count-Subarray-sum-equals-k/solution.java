class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        //traverse from start to end
        for(int i=0;i<nums.length;i++)
        {   int sum = 0;   //make sum to 0 everytime since its local sum
            for(int j=i;j<nums.length;j++)
            {			//loop starts from i instead of 0 to avoid repetetion
                sum = sum + nums[j];	//add the sum on the go till the end is reached
                if(sum == k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}