class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                flag = true;
            }
        }
        return flag;
    }
}

//LEETCODE PROBLEM TO CHECK IF THERE ARE DUPLICATES ELEMENTS
//sorting = O(logn)
//searching for duplicates = O(n)
//status : accepted

//Follow up this problem can also be solved using a HashSet