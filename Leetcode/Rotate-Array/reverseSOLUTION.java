//This program is rotate right problem, left rotation can be found at Hackerrank/problem-solving
//TODO : IMPLEMENT THIS PROBLE USING JUGGLESORT ALGORITHM
class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k%nums.length; //Incase of k >= n, to avoid cornercase
        
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);    
    }
    public int[] reverse(int nums[], int start, int end)
    {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}