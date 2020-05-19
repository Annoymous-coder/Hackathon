class Solution {
    public int fib(int N) {
    
        int prev2 = 0, prev1 = 0, current = 0;
        
        if(N<=1)
            return N;
        
        prev2 = 0;
        prev1 = 1;
        
        for(int i=2; i<=N; i++)
        {
            current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
        
    }
}

/*
Approach 4: Iterative Top-Down Approach

Intuition

Let's get rid of the need to use all of that space and instead use the minimum amount of space required. We can achieve O(1)O(1)O(1) space complexity by only storing the value of the two previous numbers and updating them as we iterate to N.

Algorithm

    Check if N <= 1, if it is then we should return N.
    Check if N == 2, if it is then we should return 1 since N is 2 and fib(2-1) + fib(2-2) equals 1 + 0 = 1.
    To use an iterative approach, we need at least 3 variables to store each state fib(N), fib(N-1) and fib(N-2).
    Preset the initial values:
        Initialize current with 0.
        Initialize prev1 with 1, since this will represent fib(N-1) when computing the current value.
        Initialize prev2 with 1, since this will represent fib(N-2) when computing the current value.
    Iterate, incrementally by 1, all the way up to and including N. Starting at 3, since 0, 1 and 2 are pre-computed.
    Set the current value to fib(N-1) + fib(N-2) because that is the value we are currently computing.
    Set the prev2 value to fib(N-1).
    Set the prev1 value to current_value.
    When we reach N+1, we will exit the loop and return the previously set current value.

*/