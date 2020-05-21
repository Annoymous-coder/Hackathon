class Solution {
    public int removeDuplicates(int[] nums) {
     
      /*
	//NORMAL METHOD TO REMOVE DUPLICATES
	//IF DISTINCT ADD TO SAME ARRAY, BUT JTH INDEX. 
	//ELEMENTS AFTER J ARE SAME AS ORIGINAL ARRAY.
        if(nums.length  <= 1)
            return nums.length;
        
        int j=0; 
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length - 1];
        return j;
    */
	//THIS SOLUTION IS SAME AS REMOVE DUPLICATES FROM SORTED ARRAY 2, WHICH SUPPORTS FOR K DUPLICATES ALLOWANCE, HERE NO DUPLICATES IS ALLOWED TO SET TO 1,
	//MEANING AT MOST 1.
        int at_most = 1;
        int i=0;
        for(int j=0; j<nums.length; j++)
        {
            if(i < at_most || nums[j] > nums[j-at_most])
            {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

