class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(start<=end) {
             if(start == end)
                return start;
            mid = (start+end)/2;
            if( nums[mid] > nums[mid + 1] )
		//end = mid because if end = mid-1 we would lose the mid element.
		//Since we continue this operation only till mid is remaining the search space i.e start==end
                end = mid;
            else 
                start = mid + 1; 
        }   
       return start; 
    }
}