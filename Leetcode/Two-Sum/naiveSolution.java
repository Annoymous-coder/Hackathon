
//The main difference between this and Two-Sum-2 is that the array is not sorted here.

//Naive Solution: Runtime O(n * n) since both the loops are dependent on the length of the array.

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