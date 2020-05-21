class Solution {
    public void moveZeroes(int[] nums) {
        
        int low = 0 , high = nums.length - 1;
        int val = 0;
        
        /*
        int i=0, j=0;
        for(i=0; i<nums.length; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if(nums[j] != 0 && nums[i] == 0)
                {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        */
        /*
        //The above code can be optimized to O(N) since we are traversing only once , keeping j ahead of i by 1.
        
        //j is for 0 and i is for non-zero elements.
        int j=0;
        for(int i=1; i<nums.length; i++)
        {   
            if(nums[j]==0 && nums[i] != 0)
            {
                nums[j] = nums[i];
                nums[i] = 0;
            }
            if(nums[j] != 0)
                j++;
        }
        */
        
        //The main logic behind this is same as , remove duplicates or remove elements which are k in the array. But after shifting left the right half will be same as original array. SO replace them with 0.
        //Ex: [0,1,0,3,12]
        //After removing occurrences of zeroes, we have [1,3,12,3,12] . So replace the last 2 elements with 0.
        int j=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
                nums[j++] = nums[i];
        }
        for(int i=j; i<nums.length; i++)
            nums[i] = 0;
    }
}
