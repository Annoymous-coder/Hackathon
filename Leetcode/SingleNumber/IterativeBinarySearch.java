class Solution {
    public int singleNonDuplicate(int[] nums) {
        
	//Corner cases
        if(nums.length == 0 || nums.length == 1)
            return nums[0];
        if(nums.length == 2 || nums[0]!=nums[1])
            return nums[0];
    
        int low = 0, high = nums.length - 1;
        
        while( low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(low == high)
                return nums[low];
            
	    //If the mid index is even then it is probable to be the single number,
	    //Check next element to see if no inflection has occurred yet.
	    //If no inflection then continue to right part of search space, or else search left including mid.
            if( mid % 2 == 0 )
            {
                if(nums[mid] == nums[mid+1])
                    low = mid + 2;
                else
                    high = mid;
            }
	    //Same way if mid index is odd.
            else if(mid % 2 == 1)
            {
                if(nums[mid] == nums[mid-1])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}

