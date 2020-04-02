/?
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

    Your returned answers (both index1 and index2) are not zero-based.
    You may assume that each input would have exactly one solution and you may not use the same element twice.
?/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0 , end = numbers.length-1;
        int ansarray[] = new int[2];
        while(start < end)
        {   
            
            if(numbers[start] + numbers[end] == target)
            {
                ansarray[0] = start+1;
                ansarray[1] = end+1;
                break;
            }
            else if(numbers[start] + numbers[end] < target)
            {
                start = start + 1;
            }
            else if(numbers[start] + numbers[end] > target)
            {
                end = end - 1;
            }
           
        }
        return ansarray;
    }
}