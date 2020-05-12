class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
        for(int i=0; i<A.length; i++)
        {
            if(A[i] > A[i+1])
                return i;
            else 
                continue;
        }

        throw new IllegalArgumentException("Invalid");
    }
}