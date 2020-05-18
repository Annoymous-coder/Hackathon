class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int low = 0, high = nums.length - 1;
        
        if(nums.length == 0 || nums.length ==1 )
            return -1;
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            //check for consistency
            if( nums[mid] - mid == nums[0] ) //mid is consistent so is all elements left of it.
            {
                //check if the next immediate element is the missing number, since all elements are sequential in nature, if the difference is greater than 1 means thay missing number lies betweeen them only.
                if( nums[mid+1] - nums[mid] > 1)
                    return nums[mid]+1;
                
                //if no immediate inconsistency continue found searching towards right.
                low = mid + 1;
            }
            //mid is inconsistent so the missing number exists in left segment.
            //before searching left check for immediate left inconsistency.
            else
            {
                if(nums[mid] - nums[mid-1] > 1)
                    return nums[mid]-1;
                
                high = mid - 1;
            }
        }
        return -1;
    }
}
/*
Principles:

        Look for inconsistency: Ideally, the difference between any element and its index must be arr[0] for every element.
        Example,
        A[] = {1, 2, 3, 4, 5} -> Consistent
        B[] = {101, 102, 103, 104} -> Consistent
        C[] = {1, 2, 4, 5, 6} -> Inconsistent as C[2] – 2 != C[0] i.e. 4 – 2 != 1
        Finding inconsistency helps to scan only half of the array each time in O(logN).

Algorithm

        Find middle element and check if it’s consistent.
        If middle element is consistent, then check if the difference between middle element and its next element is greater than 1 i.e. check if arr[mid + 1] – arr[mid] > 1
            If yes, then arr[mid] + 1 is the missing element.
            If not, then we have to scan the right half array from the middle element and jump to step-1.
        If middle element is inconsistent, then check if the difference between middle element and its previous element is greater than 1 i.e. check if arr[mid] – arr[mid – 1] > 1
            If yes, then arr[mid] – 1 is the missing element.
            If not, then we have to scan the left half array from the middle element and jump to step-1.

*/