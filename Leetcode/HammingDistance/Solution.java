class Solution {
    public int hammingDistance(int x, int y) {
        int bit = 0;
        
        //perform xor of two bits gives different bit elements, and they will be set to 1.
        bit = x ^ y;
        
        //Count the number of ones in a binary number using Brian Shennigan's Algorithm.
        int count = 0;
        while(bit > 0)
        {   
            //unsets the rightmost bit and the number of times this loop runs gives us the number of one's present.
            bit = bit & (bit-1);
            count++;
        }
        return count;
    }
}