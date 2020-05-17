/*

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2

Example 2:

Input: [1,3,5,6], 2
Output: 1

Example 3:

Input: [1,3,5,6], 7
Output: 4

*/

//Iterative Implementation
//Logic is exactly same as Binary Search if found,
//When an element is not found then both low and high will be at its nearest position of key.
//So compare either low/high with key, if greater then return index-1
//If key is smaller then return low index not low-1 since then it might return -1, which is not accessible.

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0, high = nums.length-1;
        int mid = 0;
        
        
        while(low<=high)
        {
            mid = low + (high - low)/2;
            
            if(low == high)
            {
                if(target > nums[low])
                    return low + 1;
                else
                    return low;
            }
            
            if(nums[mid] == target) {
                return mid;
            }
            else if(target > nums[mid])a
            
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            
        }
        return mid;
        
    }
}


