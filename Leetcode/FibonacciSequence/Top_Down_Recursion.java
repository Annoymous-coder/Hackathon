class Solution {
    public int fib(int N) {
        
        if(N <= 1) {
            return N;
        }
        return Memoize(N);
    }
    
    public int Memoize(int N) {
        int cache[] = new int[N+1];
        cache[1] = 1;
        
        for(int i=2; i<= N; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
    }
    return cache[N];
}

/*

Approach 2: Bottom-Up Approach using Memoization

Intuition

Improve upon the recursive option by using iteration, still solving for all of the sub-problems and returning the answer for N, using already computed Fibonacci values. In using a bottom-up approach, we can iteratively compute and store the values, only returning once we reach the result.

Algorithm

    If N is less than or equal to 1, return N
    Otherwise, iterate through N, storing each computed answer in an array along the way.
    Use this array as a reference to the 2 previous numbers to calculate the current Fibonacci number.
    Once we've reached the last number, return it's Fibonacci number.

*/