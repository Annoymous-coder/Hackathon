class Solution {
    public int missingNumber(int[] nums) {
        
        //Set XOR bit intially to the size of the array.
        //Since the range of numbers between 0 to n-1 are missing only one element within N,
        //Assume that missing to be N.
        int bit =  nums.length;
        
        //Xor of index,its value and the intiall bit will clear out all repeating elemets, except for the 
        //non-repeating one, which happens to be our missing element.
        for(int i=0; i<nums.length; i++)
        {
            bit = bit ^ i ^ nums[i];
        }
        
        return bit;
        
    }
}