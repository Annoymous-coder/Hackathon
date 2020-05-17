class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        
        int res[][] = new int[r][c];
        
        if(nums.length * nums[0].length != r*c || nums.length == 0)
            return nums;
        
        Queue <Integer> queue = new LinkedList < >();
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[0].length; j++)
            { 
                queue.add(nums[i][j]);
            }
        }
        
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }
}

/*
Approach #1 Using queue [Accepted]

Algorithm

The simplest method is to extract all the elements of the given matrix by reading the elements in a row-wise fashion. In this implementation, we use a queue to put the extracted elements. Then, we can take out the elements of the queue formed in a serial order and arrange the elements in the resultant required matrix in a row-by-row order again.

The formation of the resultant matrix won't be possible if the number of elements in the original matrix isn't equal to the number of elements in the resultant matrix.

*/