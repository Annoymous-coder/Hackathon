class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i] == nums[j] && i!=j)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
}

O(n2)
status : TIME LIMIT EXCEEDED