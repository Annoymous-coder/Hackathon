class Solution {
    public int findDuplicate(int[] nums) {
     
        Arrays.sort(nums);      //O(nLogn)
        
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("No duplicates found");
    }
}

//LOGIC IS THAT WHEN ARRAYS ARE SORTED THEN THE ELEMENTS ADJACENT TO IT IS THE SAME.