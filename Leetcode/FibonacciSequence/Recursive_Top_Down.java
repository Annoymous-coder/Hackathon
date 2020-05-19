class Solution {
    public int fib(int N) {
    
        Integer cache[] = new Integer[31];
        
        if(N<=1)
            return N;
        cache[0] = 0;
        cache[1] = 1;
        
        //Use Integer since in int all values are 0 by default using which we cannot check for empty since 0 is also a Fibonacci number.
        if(cache[N]!=null) {
            return cache[N];
        }
        
        cache[N] = fib(N-1) + fib(N-2);
        return cache[N];
        
    }
}

/*
Approach 3: Top-Down Approach using Memoization

Intuition

Solve for all of the sub-problems, use memoization to store the pre-computed answers, then return the answer for N. We will leverage recursion, but in a smarter way by not repeating the work to calculate existing values.

Algorithm

    Check if N <= 1. If it is, return N.
    Call and return memoize(N)
    If N exists in the map, return the cached value for N
    Otherwise set the value of N, in our mapping, to the value of memoize(N-1) + memoize(N-2)

*/