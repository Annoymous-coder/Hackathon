class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int maxArea = Integer.MIN_VALUE;
        int semiMax =  0;
        for(int i=0; i<height.length; i++)
        {
            for(int j=i+1; j<height.length; j++)
            {
                maxArea = Math.max(maxArea , Math.min(height[i], height[j]) * (j-i));
            }    
        }
        return maxArea;
    }
}

//LOGIC IS TO TRAVERSE THROUGH THE ARRAY BY TWO FOR LOOPS AND FIND OUT MAXAREA BY JUST INCREASING BOTH POINTER AND MAKE SURE BOTH POINTERS DONT POINT TO THE SAME HEIGHT.