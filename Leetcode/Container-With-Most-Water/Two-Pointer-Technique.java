class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int maxArea = Integer.MIN_VALUE;
        int semiMax =  0;
        while(startt < end)
        {
            semiMax = Math.min(height[start] , height[end]) * (end - start)
            if(height[end] < height[start])
            {
                end--;
            }
            else
            {
                start++;
            }
            maxArae = Math.max(maxArea , semiMax);
        }
        return maxArea;
    }
}
//LOGIC HERE IS TO USE TWO POINTER TECHNIQUE.
//ONE AT START I.E 0 AND OTHER POINTER AT THE END OF ARRAY I.E N-1, N = ARRAY LENGTH
//FIND THE MINIMUM VALUE B/W BOTH VALUES AND POINTER AND MULTIPLY BY THEIR DIFFERENCES OF INDICES TO GIVE THE DISTANCE BETWEEN WITH THESE TWO POINTERS TO GET THE AREA.
//NOW SINCE WE HAVE A LONGER HEIGHT , WE INCREMENT THE POINTER WHICH HAS SHORTER HEIGHT IN THE HOPE OF FINDING THE SHORTER ONE.
//IN EVERY TRAVERSAL WE KEEP TRACK OF MAXAREA.