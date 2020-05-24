class Solution {
    public int[] findErrorNums(int[] nums) {
        
        //first pass
        int xor = 0;
        for(int i=1; i<=nums.length; i++)
        {
            xor = xor ^ (i ^ nums[i-1]);
        }
        
        //second pass
        int oneBit = 0;
        
        //get the rightmost set-bit(The bit which is 1)
        oneBit = xor & ~(xor-1);
        
        int setXor = 0, unsetXor = 0;
        
        for(int i=1; i<=nums.length; i++)
        {   
            //for i
            if((oneBit & i) > 0)
                setXor = setXor^i;
            else
                unsetXor = unsetXor^i;
            
            //for nums[i-1]
            if((oneBit & nums[i-1]) > 0)
                setXor = setXor^nums[i-1];
            else
                unsetXor = unsetXor^nums[i-1];
        }
        
        //third pass
        int repeating_number = setXor, missing_number =  unsetXor;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == repeating_number)
            {
                return new int[] {repeating_number, missing_number};
            }
        }
        
        return new int[]{ missing_number, repeating_number};
    }
}