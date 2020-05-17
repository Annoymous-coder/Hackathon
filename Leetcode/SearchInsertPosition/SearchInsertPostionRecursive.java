class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0, high = nums.length-1;
        
        return getPosition(nums, low, high, target);
    }
    
    public int getPosition(int nums[], int low, int high, int target)
    {
        int mid = 0;
        
        //When low==high else part gets executed, i.e if the target is not found in the array(If segment)
        if(low<high)
        {
            mid = low + (high - low)/2;
            
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                return getPosition(nums, mid+1, high, target);
            else
                return getPosition(nums, low, mid-1, target);
        }
        //Else handles when the given target is not found in the array, the low and high will be in same position , compare either low/high with target to return the suitabe index value.
        else
        {   
            //Case: [1],key = 1
            if(target <= nums[low])
                return low;
            else
                return low+1;
        }
        
      
    }
}



