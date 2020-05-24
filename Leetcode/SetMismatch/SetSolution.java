class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashSet <Integer> set = new HashSet <Integer>();
        int result_set[] = new int[2];
        
        for(int i=0; i<nums.length; i++)
        {
            if(set.contains(nums[i]))
            {
                result_set[0] = nums[i];
            }
            else
            {
                set.add(nums[i]);
            }
        }
        
        for(int i=1; i<=nums.length; i++)
        {   
            if(set.contains(i)) {
                continue;
             }
            else
            {
                result_set[1] = i;
            }
        }
        return result_set;
    }
}