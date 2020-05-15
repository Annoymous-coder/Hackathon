//Program to find the minimum element in sorted rotated array with duplicates allowed.
class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        
        while(start <= end)
        {
            mid = start + (end - start)/2;
                        
            //Handle few corner cases, when array is empty, only one element , already sorted
                                        //case:[1]            //case:[1,1]
            if(nums[start] < nums[end] || nums.length == 1 || start == end)
                return nums[start];
            
            //Inflection point(pivot point) property only next element is smaller than mid, if it is the MIN element.
            if(nums[mid] > nums[(mid+1)%nums.length])
                return nums[mid+1];
            
            //Handle duplicates.Ignore last element.
            if(nums[mid] == nums[end])
            {
                end--;
            }
            //Handle duplicates.Ignore last element. 
            else if(nums[mid] == nums[start])
            {
                start++;
            }    
            
            //1 .No nums[mid] <= nums[end] because then nums[mid]==nums[end] case will become invalid.
            //2. No end = mid - 1 because according to the present if statement mid is smaller than end meaning it is also a potential smallest element present so include or else by using end = mid-1 will leave out the mid element from search space giving faulty results.So search for smallest ele from start to mid all inclusive.
            else if(nums[mid] < nums[end])
            {
                end = mid;
            }
            //1. No nums[start] <= nums[mid] because then the if statement above nums[mid] == nums[start] intended to handle duplicate elements will become ambiguous.
            //2. No start = mid as above because from below if statement it is pretty evident that nums[start] till nums[mid] is sorted and no chance of inflection chance.
            //3. We can replace the below if statement by nums[mid] > nums[end] meaning the segment is unsorted and has a chance of inflection but mid is already greater than high so no probablity of mid being min so use start = mid + 1. Have not used this method in order to keep it with par and similarity with non duplicate element problem.
            else if(nums[start] < nums[mid])
            {
                start = mid + 1;
            }
        }
        return -1; 
    }
}