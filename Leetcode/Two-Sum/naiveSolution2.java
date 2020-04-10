class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement = 0;
        for(int i=0;i<nums.length;i++) {
            complement = target - nums[i];
            
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j] == complement) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}