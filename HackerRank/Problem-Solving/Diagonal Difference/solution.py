#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'diagonalDifference' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def diagonalDifference(arr):
    # Write your code here
    psum = 0
    nsum = 0
    for i in range(0,len(arr)):
        nsum = nsum + arr[i][len(arr)-i-1]    
        for j in range(0,len(arr)):
            #print("run")
            if i==j:
                psum+=arr[i][j]
    return(abs(psum - nsum))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
