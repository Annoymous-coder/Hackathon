class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int start = 0, end = 0;
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target && i!=j)
                {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}