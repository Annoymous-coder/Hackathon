class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        
        int res[][] = new int[r][c];
        
        //Check the total number of elements are same or not., 
        //Return same array if empty
        if(nums.length * nums[0].length != r*c || nums.length ==0)
            return nums;
        
        int rows = 0, cols = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[0].length; j++)
            {
                res[rows][cols] = nums[i][j];
                
                cols++;
                if(cols == c)
                {
                    rows++;
                    cols=0;
                }
            }
        }
        return res;
    }
}
/*
Instead of unnecessarily using the queue as in the brute force approach, we can keep putting the numbers in the resultant matrix directly while iterating over the given matrix in a row-by-row order. While putting the numbers in the resultant array, we fix a particular row and keep on incrementing the column numbers only till we reach the end of the required columns indicated by ccc. At this moment, we update the row index by incrementing it and reset the column index to start from 0 again. Thus, we can save the space consumed by the queue for storing the data that just needs to be copied into a new 
array.
*/